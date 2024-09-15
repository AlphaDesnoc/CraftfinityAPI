package fr.craftfinity.services;

import fr.craftfinity.models.PlayerPermission;
import fr.craftfinity.repositories.PlayerPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class PlayerPermissionService {
    
    @Autowired
    private PlayerPermissionRepository playerPermissionRepository;

    public List<PlayerPermission> getAllPlayerPermissions() {
        return playerPermissionRepository.findAll();
    }

    public PlayerPermission getPlayerPermissionById(Long id) {
        return playerPermissionRepository.findById(id).orElse(null);
    }

    public PlayerPermission createPlayerPermission(PlayerPermission playerPermission) {
        return playerPermissionRepository.save(playerPermission);
    }

    public PlayerPermission updatePlayerPermission(Long id, PlayerPermission playerPermissionDetails) {
        PlayerPermission playerPermission = playerPermissionRepository.findById(id).orElse(null);
        if (playerPermission != null) {
            playerPermission.setInfinityplayer(playerPermissionDetails.getInfinityplayer());
            playerPermission.setPermissionid(playerPermissionDetails.getPermissionid());
            return playerPermissionRepository.save(playerPermission);
        }
        return null;
    }

    public void deletePlayerPermission(Long id) {
        playerPermissionRepository.deleteById(id);
    }

}
