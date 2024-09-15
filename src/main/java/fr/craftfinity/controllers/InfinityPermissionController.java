package fr.craftfinity.controllers;

import fr.craftfinity.models.InfinityPermission;
import fr.craftfinity.services.InfinityPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infinity/permission")
public final class InfinityPermissionController {

    @Autowired
    private InfinityPermissionService corePlayerService;

    @GetMapping
    public List<InfinityPermission> getAllInfinityPermissions() {
        return corePlayerService.getAllInfinityPermissions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfinityPermission> getInfinityPermissionById(@PathVariable Long id) {
        InfinityPermission player = corePlayerService.getInfinityPermissionById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public InfinityPermission createInfinityPermission(@RequestBody InfinityPermission player) {
        return corePlayerService.createInfinityPermission(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfinityPermission> updateInfinityPermission(@PathVariable Long id, @RequestBody InfinityPermission playerDetails) {
        InfinityPermission updatedPlayer = corePlayerService.updateInfinityPermission(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfinityPermission(@PathVariable Long id) {
        corePlayerService.deleteInfinityPermission(id);
        return ResponseEntity.noContent().build();
    }

}
