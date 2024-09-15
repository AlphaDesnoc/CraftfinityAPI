package fr.craftfinity.controllers;

import fr.craftfinity.models.InfinityGame;
import fr.craftfinity.services.InfinityGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infinity/game")
public final class InfinityGameController {

    @Autowired
    private InfinityGameService infinityGameService;

    @GetMapping
    public List<InfinityGame> getAllInfinityGames() {
        return infinityGameService.getAllInfinityGames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfinityGame> getInfinityGameById(@PathVariable Long id) {
        InfinityGame player = infinityGameService.getInfinityGameById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public InfinityGame createInfinityGame(@RequestBody InfinityGame player) {
        return infinityGameService.createInfinityGame(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfinityGame> updateInfinityGame(@PathVariable Long id, @RequestBody InfinityGame playerDetails) {
        InfinityGame updatedPlayer = infinityGameService.updateInfinityGame(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfinityGame(@PathVariable Long id) {
        infinityGameService.deleteInfinityGame(id);
        return ResponseEntity.noContent().build();
    }

}
