package fr.craftfinity.controllers;

import fr.craftfinity.models.InfinityGroup;
import fr.craftfinity.services.InfinityGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infinity/group")
public final class InfinityGroupController {

    @Autowired
    private InfinityGroupService infinityGroupService;

    @GetMapping
    public List<InfinityGroup> getAllInfinityGroups() {
        return infinityGroupService.getAllInfinityGroups();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfinityGroup> getInfinityGroupById(@PathVariable Long id) {
        InfinityGroup player = infinityGroupService.getInfinityGroupById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public InfinityGroup createInfinityGroup(@RequestBody InfinityGroup player) {
        return infinityGroupService.createInfinityGroup(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfinityGroup> updateInfinityGroup(@PathVariable Long id, @RequestBody InfinityGroup playerDetails) {
        InfinityGroup updatedPlayer = infinityGroupService.updateInfinityGroup(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfinityGroup(@PathVariable Long id) {
        infinityGroupService.deleteInfinityGroup(id);
        return ResponseEntity.noContent().build();
    }

}
