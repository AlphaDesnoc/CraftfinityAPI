package fr.craftfinity.controllers;

import fr.craftfinity.models.GameType;
import fr.craftfinity.services.GameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gametype")
public final class GameTypeController {

    @Autowired
    private GameTypeService gameTypeService;

    @GetMapping
    public List<GameType> getAllGameTypes() {
        return gameTypeService.getAllGameType();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameType> getGameTypeById(@PathVariable Long id) {
        GameType gameType = gameTypeService.getGameTypeById(id);
        if (gameType != null) {
            return ResponseEntity.ok(gameType);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public GameType createGameType(@RequestBody GameType gameType) {
        return gameTypeService.createGameType(gameType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GameType> updateGameType(@PathVariable Long id, @RequestBody GameType gameTypeDetails) {
        GameType updateGameType = gameTypeService.updateGameType(id, gameTypeDetails);
        if (updateGameType != null) {
            return ResponseEntity.ok(updateGameType);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGameType(@PathVariable Long id) {
        gameTypeService.deleteGameType(id);
        return ResponseEntity.noContent().build();
    }

}
