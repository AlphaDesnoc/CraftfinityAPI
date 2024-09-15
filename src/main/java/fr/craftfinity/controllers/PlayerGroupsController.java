package fr.craftfinity.controllers;

import fr.craftfinity.models.PlayerGroups;
import fr.craftfinity.services.PlayerGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player/groups")
public final class PlayerGroupsController {

    @Autowired
    private PlayerGroupsService corePlayerService;

    @GetMapping
    public List<PlayerGroups> getAllPlayerGroups() {
        return corePlayerService.getAllPlayerGroupss();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerGroups> getPlayerGroupsById(@PathVariable Long id) {
        PlayerGroups player = corePlayerService.getPlayerGroupsById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public PlayerGroups createPlayerGroups(@RequestBody PlayerGroups player) {
        return corePlayerService.createPlayerGroups(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerGroups> updatePlayerGroups(@PathVariable Long id, @RequestBody PlayerGroups playerDetails) {
        PlayerGroups updatedPlayer = corePlayerService.updatePlayerGroups(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerGroups(@PathVariable Long id) {
        corePlayerService.deletePlayerGroups(id);
        return ResponseEntity.noContent().build();
    }

}
