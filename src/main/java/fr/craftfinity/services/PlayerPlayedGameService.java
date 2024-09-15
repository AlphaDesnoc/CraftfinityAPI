package fr.craftfinity.services;

import fr.craftfinity.models.PlayerPlayedGame;
import fr.craftfinity.repositories.PlayerPlayedGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class PlayerPlayedGameService {
    
    @Autowired
    private PlayerPlayedGameRepository playerPlayedGameRepository;

    public List<PlayerPlayedGame> getAllPlayerPlayedGames() {
        return playerPlayedGameRepository.findAll();
    }

    public PlayerPlayedGame getPlayerPlayedGameById(Long id) {
        return playerPlayedGameRepository.findById(id).orElse(null);
    }

    public PlayerPlayedGame createPlayerPlayedGame(PlayerPlayedGame playerPlayedGame) {
        return playerPlayedGameRepository.save(playerPlayedGame);
    }

    public PlayerPlayedGame updatePlayerPlayedGame(Long id, PlayerPlayedGame playerPlayedGameDetails) {
        PlayerPlayedGame playerPlayedGame = playerPlayedGameRepository.findById(id).orElse(null);
        if (playerPlayedGame != null) {
            playerPlayedGame.setInfinityplayer(playerPlayedGameDetails.getInfinityplayer());
            playerPlayedGame.setGameid(playerPlayedGameDetails.getGameid());
            playerPlayedGame.setPlayerkill(playerPlayedGameDetails.getPlayerkill());
            playerPlayedGame.setPlayerdead(playerPlayedGameDetails.getPlayerdead());
            playerPlayedGame.setHavewin(playerPlayedGameDetails.isHavewin());
            return playerPlayedGameRepository.save(playerPlayedGame);
        }
        return null;
    }

    public void deletePlayerPlayedGame(Long id) {
        playerPlayedGameRepository.deleteById(id);
    }

}
