package fr.craftfinity.services;

import fr.craftfinity.models.PlayerParameter;
import fr.craftfinity.repositories.PlayerParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class PlayerParameterService {

    @Autowired
    private PlayerParameterRepository playerParameterRepository;

    public List<PlayerParameter> getAllPlayerParameters() {
        return playerParameterRepository.findAll();
    }

    public PlayerParameter getPlayerParameterById(Long id) {
        return playerParameterRepository.findById(id).orElse(null);
    }

    public PlayerParameter createPlayerParameter(PlayerParameter playerParameter) {
        return playerParameterRepository.save(playerParameter);
    }

    public PlayerParameter updatePlayerParameter(Long id, PlayerParameter playerParameterDetails) {
        PlayerParameter playerParameter = playerParameterRepository.findById(id).orElse(null);
        if (playerParameter != null) {
            playerParameter.setInfinityplayer(playerParameterDetails.getInfinityplayer());
            playerParameter.setParametername(playerParameterDetails.getParametername());
            playerParameter.setStatus(playerParameterDetails.isStatus());
            return playerParameterRepository.save(playerParameter);
        }
        return null;
    }

    public void deletePlayerParameter(Long id) {
        playerParameterRepository.deleteById(id);
    }
    
}
