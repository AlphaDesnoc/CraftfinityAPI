package fr.craftfinity.controllers;

import fr.craftfinity.models.PlayerMoney;
import fr.craftfinity.services.PlayerMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player/money")
public final class PlayerMoneyController {

    @Autowired
    private PlayerMoneyService corePlayerService;

    @GetMapping
    public List<PlayerMoney> getAllPlayerMoneys() {
        return corePlayerService.getAllPlayerMoneys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerMoney> getPlayerMoneyById(@PathVariable Long id) {
        PlayerMoney player = corePlayerService.getPlayerMoneyById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public PlayerMoney createPlayerMoney(@RequestBody PlayerMoney player) {
        return corePlayerService.createPlayerMoney(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerMoney> updatePlayerMoney(@PathVariable Long id, @RequestBody PlayerMoney playerDetails) {
        PlayerMoney updatedPlayer = corePlayerService.updatePlayerMoney(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerMoney(@PathVariable Long id) {
        corePlayerService.deletePlayerMoney(id);
        return ResponseEntity.noContent().build();
    }

}
