package fr.craftfinity.controllers;

import fr.craftfinity.models.GroupPermission;
import fr.craftfinity.services.GroupPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grouppermission")
public final class GroupPermissionController {

    @Autowired
    private GroupPermissionService groupPermissionService;

    @GetMapping
    public List<GroupPermission> getAllGroupPermissions() {
        return groupPermissionService.getAllGroupPermission();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroupPermission> getGroupPermissionById(@PathVariable Long id) {
        GroupPermission player = groupPermissionService.getGroupPermissionById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public GroupPermission createGroupPermission(@RequestBody GroupPermission groupPermission) {
        return groupPermissionService.createGroupPermission(groupPermission);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroupPermission> updateGroupPermission(@PathVariable Long id, @RequestBody GroupPermission groupPermissionDetails) {
        GroupPermission updateGroupPermission = groupPermissionService.updateGroupPermission(id, groupPermissionDetails);
        if (updateGroupPermission != null) {
            return ResponseEntity.ok(updateGroupPermission);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroupPermission(@PathVariable Long id) {
        groupPermissionService.deleteGroupPermission(id);
        return ResponseEntity.noContent().build();
    }

}
