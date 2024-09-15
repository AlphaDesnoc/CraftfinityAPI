package fr.craftfinity.services;

import fr.craftfinity.models.PlayerGroups;
import fr.craftfinity.repositories.PlayerGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class PlayerGroupsService {

    @Autowired
    private PlayerGroupsRepository playerGroupsRepository;

    public List<PlayerGroups> getAllPlayerGroupss() {
        return playerGroupsRepository.findAll();
    }

    public PlayerGroups getPlayerGroupsById(Long id) {
        return playerGroupsRepository.findById(id).orElse(null);
    }

    public PlayerGroups createPlayerGroups(PlayerGroups playerGroups) {
        return playerGroupsRepository.save(playerGroups);
    }

    public PlayerGroups updatePlayerGroups(Long id, PlayerGroups playerGroupsDetails) {
        PlayerGroups playerGroups = playerGroupsRepository.findById(id).orElse(null);
        if (playerGroups != null) {
            playerGroups.setGroupid(playerGroupsDetails.getGroupid());
            playerGroups.setInfinityplayer(playerGroupsDetails.getInfinityplayer());
            return playerGroupsRepository.save(playerGroups);
        }
        return null;
    }

    public void deletePlayerGroups(Long id) {
        playerGroupsRepository.deleteById(id);
    }
    
}
