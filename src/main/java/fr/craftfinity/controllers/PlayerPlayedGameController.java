package fr.craftfinity.controllers;

import fr.craftfinity.models.PlayerPlayedGame;
import fr.craftfinity.services.PlayerPlayedGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player/playedgame")
public final class PlayerPlayedGameController {

    @Autowired
    private PlayerPlayedGameService corePlayerService;

    @GetMapping
    public List<PlayerPlayedGame> getAllPlayerPlayedGames() {
        return corePlayerService.getAllPlayerPlayedGames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerPlayedGame> getPlayerPlayedGameById(@PathVariable Long id) {
        PlayerPlayedGame player = corePlayerService.getPlayerPlayedGameById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public PlayerPlayedGame createPlayerPlayedGame(@RequestBody PlayerPlayedGame player) {
        return corePlayerService.createPlayerPlayedGame(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerPlayedGame> updatePlayerPlayedGame(@PathVariable Long id, @RequestBody PlayerPlayedGame playerDetails) {
        PlayerPlayedGame updatedPlayer = corePlayerService.updatePlayerPlayedGame(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerPlayedGame(@PathVariable Long id) {
        corePlayerService.deletePlayerPlayedGame(id);
        return ResponseEntity.noContent().build();
    }

}
