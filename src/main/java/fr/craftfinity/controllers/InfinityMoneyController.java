package fr.craftfinity.controllers;

import fr.craftfinity.models.InfinityMoney;
import fr.craftfinity.services.InfinityMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infinity/money")
public final class InfinityMoneyController {

    @Autowired
    private InfinityMoneyService infinityMoneyService;

    @GetMapping
    public List<InfinityMoney> getAllInfinityMoneys() {
        return infinityMoneyService.getAllInfinityMoneys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfinityMoney> getInfinityMoneyById(@PathVariable Long id) {
        InfinityMoney player = infinityMoneyService.getInfinityMoneyById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public InfinityMoney createInfinityMoney(@RequestBody InfinityMoney player) {
        return infinityMoneyService.createInfinityMoney(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfinityMoney> updateInfinityMoney(@PathVariable Long id, @RequestBody InfinityMoney playerDetails) {
        InfinityMoney updatedPlayer = infinityMoneyService.updateInfinityMoney(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfinityMoney(@PathVariable Long id) {
        infinityMoneyService.deleteInfinityMoney(id);
        return ResponseEntity.noContent().build();
    }

}
