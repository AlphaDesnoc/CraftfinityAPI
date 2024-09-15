package fr.craftfinity.controllers;

import fr.craftfinity.models.InfinityPlayer;
import fr.craftfinity.services.InfinityPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infinity/players")
public class InfinityPlayerController {
    @Autowired
    private InfinityPlayerService corePlayerService;

    @GetMapping
    public List<InfinityPlayer> getAllPlayers() {
        return corePlayerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfinityPlayer> getPlayerById(@PathVariable Long id) {
        InfinityPlayer player = corePlayerService.getPlayerById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public InfinityPlayer createPlayer(@RequestBody InfinityPlayer player) {
        return corePlayerService.createPlayer(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfinityPlayer> updatePlayer(@PathVariable Long id, @RequestBody InfinityPlayer playerDetails) {
        InfinityPlayer updatedPlayer = corePlayerService.updatePlayer(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        corePlayerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }
}