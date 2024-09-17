package fr.craftfinity.controllers;

import fr.craftfinity.models.Plugin;
import fr.craftfinity.security.JwtTokenService;
import fr.craftfinity.services.PluginService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtTokenService jwtTokenService;
    private final PluginService pluginService;

    @Autowired
    public AuthController(JwtTokenService jwtTokenService, PluginService pluginManagementService) {
        this.jwtTokenService = jwtTokenService;
        this.pluginService = pluginManagementService;
    }

    @PostMapping("/token")
    public ResponseEntity<?> getToken(@RequestBody Plugin plugin) {
        if (pluginService.verifyPlugin(plugin.getPluginid(), plugin.getSecret_key())) {
            String token = jwtTokenService.generateToken(plugin.getPluginid());
            return ResponseEntity.ok(new JwtResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerPlugin(@RequestBody Plugin plugin) {
        try {
            if (plugin.getPluginid() == null || plugin.getSecret_key() == null) {
                return ResponseEntity.badRequest().body("Plugin ID and Secret Key are required");
            }
            pluginService.registerPlugin(plugin);
            return ResponseEntity.ok("Plugin registered successfully");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to register plugin: " + e.getMessage());
        }
    }
}

record JwtResponse(String token) {}