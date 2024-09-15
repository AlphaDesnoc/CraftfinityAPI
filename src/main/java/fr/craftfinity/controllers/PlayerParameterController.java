package fr.craftfinity.controllers;

import fr.craftfinity.models.PlayerParameter;
import fr.craftfinity.services.PlayerParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player/parameter")
public final class PlayerParameterController {

    @Autowired
    private PlayerParameterService corePlayerService;

    @GetMapping
    public List<PlayerParameter> getAllPlayerParameters() {
        return corePlayerService.getAllPlayerParameters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerParameter> getPlayerParameterById(@PathVariable Long id) {
        PlayerParameter player = corePlayerService.getPlayerParameterById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public PlayerParameter createPlayerParameter(@RequestBody PlayerParameter player) {
        return corePlayerService.createPlayerParameter(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerParameter> updatePlayerParameter(@PathVariable Long id, @RequestBody PlayerParameter playerDetails) {
        PlayerParameter updatedPlayer = corePlayerService.updatePlayerParameter(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerParameter(@PathVariable Long id) {
        corePlayerService.deletePlayerParameter(id);
        return ResponseEntity.noContent().build();
    }

}
