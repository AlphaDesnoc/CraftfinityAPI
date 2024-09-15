package fr.craftfinity.controllers;

import fr.craftfinity.models.PlayerPermission;
import fr.craftfinity.services.PlayerPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player/permission")
public final class PlayerPermissionController {

    @Autowired
    private PlayerPermissionService corePlayerService;

    @GetMapping
    public List<PlayerPermission> getAllPlayerPermissions() {
        return corePlayerService.getAllPlayerPermissions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerPermission> getPlayerPermissionById(@PathVariable Long id) {
        PlayerPermission player = corePlayerService.getPlayerPermissionById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public PlayerPermission createPlayerPermission(@RequestBody PlayerPermission player) {
        return corePlayerService.createPlayerPermission(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerPermission> updatePlayerPermission(@PathVariable Long id, @RequestBody PlayerPermission playerDetails) {
        PlayerPermission updatedPlayer = corePlayerService.updatePlayerPermission(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerPermission(@PathVariable Long id) {
        corePlayerService.deletePlayerPermission(id);
        return ResponseEntity.noContent().build();
    }

}
