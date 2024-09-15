package fr.craftfinity.services;

import fr.craftfinity.models.PlayerMoney;
import fr.craftfinity.repositories.PlayerMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class PlayerMoneyService {

    @Autowired
    private PlayerMoneyRepository playerMoneyRepository;

    public List<PlayerMoney> getAllPlayerMoneys() {
        return playerMoneyRepository.findAll();
    }

    public PlayerMoney getPlayerMoneyById(Long id) {
        return playerMoneyRepository.findById(id).orElse(null);
    }

    public PlayerMoney createPlayerMoney(PlayerMoney playerMoney) {
        return playerMoneyRepository.save(playerMoney);
    }

    public PlayerMoney updatePlayerMoney(Long id, PlayerMoney playerMoneyDetails) {
        PlayerMoney playerMoney = playerMoneyRepository.findById(id).orElse(null);
        if (playerMoney != null) {
            playerMoney.setMoneyid(playerMoneyDetails.getMoneyid());
            playerMoney.setInfinityplayer(playerMoneyDetails.getInfinityplayer());
            playerMoney.setAmount(playerMoneyDetails.getAmount());
            return playerMoneyRepository.save(playerMoney);
        }
        return null;
    }

    public void deletePlayerMoney(Long id) {
        playerMoneyRepository.deleteById(id);
    }
    
}
