package fr.craftfinity.controllers;

import fr.craftfinity.models.InfinityRank;
import fr.craftfinity.services.InfinityRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infinity/ranks")
public final class InfinityRankController {

    @Autowired
    private InfinityRankService rankService;

    @GetMapping
    public List<InfinityRank> getAllRanks() {
        return rankService.getAllRanks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfinityRank> getRankById(@PathVariable Long id) {
        InfinityRank rank = rankService.getRankByID(id);
        if (rank != null) {
            return ResponseEntity.ok(rank);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public InfinityRank createRank(@RequestBody InfinityRank rank) {
        return rankService.createRank(rank);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfinityRank> updateRank(@PathVariable Long id, @RequestBody InfinityRank rankDetails) {
        InfinityRank updatedRank = rankService.updateRank(id, rankDetails);
        if (updatedRank != null) {
            return ResponseEntity.ok(updatedRank);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRank(@PathVariable Long id) {
        rankService.deleteRank(id);
        return ResponseEntity.noContent().build();
    }

}
