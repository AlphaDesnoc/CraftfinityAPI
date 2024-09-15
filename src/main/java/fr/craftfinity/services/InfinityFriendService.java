package fr.craftfinity.services;

import fr.craftfinity.models.InfinityFriend;
import fr.craftfinity.repositories.InfinityFriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class InfinityFriendService {

    @Autowired
    private InfinityFriendRepository infinityFriendRepository;

    public List<InfinityFriend> getAllInfinityFriend() {
        return infinityFriendRepository.findAll();
    }

    public InfinityFriend getInfinityFriendById(Long id) {
        return infinityFriendRepository.findById(id).orElse(null);
    }

    public InfinityFriend createInfinityFriend(InfinityFriend infinityFriend) {
        return infinityFriendRepository.save(infinityFriend);
    }

    public InfinityFriend updateInfinityFriend(Long id, InfinityFriend infinityFriendDetails) {
        InfinityFriend infinityFriend = infinityFriendRepository.findById(id).orElse(null);
        if (infinityFriend != null) {
            infinityFriend.setInfinityplayer(infinityFriendDetails.getInfinityplayer());
            infinityFriend.setFriendid(infinityFriendDetails.getFriendid());
            return infinityFriendRepository.save(infinityFriend);
        }
        return null;
    }

    public void deleteInfinityFriend(Long id) {
        infinityFriendRepository.deleteById(id);
    }

}
