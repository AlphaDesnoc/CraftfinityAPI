package fr.craftfinity.controllers;

import fr.craftfinity.models.InfinityFriend;
import fr.craftfinity.services.InfinityFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infinity/friend")
public final class InfinityFriendController {

    @Autowired
    private InfinityFriendService infinityFriendService;

    @GetMapping
    public List<InfinityFriend> getAllInfinityFriends() {
        return infinityFriendService.getAllInfinityFriend();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfinityFriend> getInfinityFriendById(@PathVariable Long id) {
        InfinityFriend player = infinityFriendService.getInfinityFriendById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public InfinityFriend createInfinityFriend(@RequestBody InfinityFriend player) {
        return infinityFriendService.createInfinityFriend(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InfinityFriend> updateInfinityFriend(@PathVariable Long id, @RequestBody InfinityFriend playerDetails) {
        InfinityFriend updatedPlayer = infinityFriendService.updateInfinityFriend(id, playerDetails);
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfinityFriend(@PathVariable Long id) {
        infinityFriendService.deleteInfinityFriend(id);
        return ResponseEntity.noContent().build();
    }

}
