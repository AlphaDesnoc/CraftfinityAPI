package fr.craftfinity.services;

import fr.craftfinity.models.GameType;
import fr.craftfinity.models.InfinityPlayer;
import fr.craftfinity.repositories.GameTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class GameTypeService {

    @Autowired
    private GameTypeRepository gameTypeRepository;

    public List<GameType> getAllGameType() {
        return gameTypeRepository.findAll();
    }

    public GameType getGameTypeById(Long id) {
        return gameTypeRepository.findById(id).orElse(null);
    }

    public GameType createGameType(GameType gameType) {
        return gameTypeRepository.save(gameType);
    }

    public GameType updateGameType(Long id, GameType gameTypeDetails) {
        GameType gameType = gameTypeRepository.findById(id).orElse(null);
        if (gameType != null) {
            gameType.setName(gameTypeDetails.getName());
            gameType.setDescription(gameTypeDetails.getDescription());
            gameType.setDisplaymaterial(gameTypeDetails.getDisplaymaterial());
            gameType.setMinplayer(gameTypeDetails.getMinplayer());
            gameType.setMaxplayer(gameTypeDetails.getMaxplayer());
            return gameTypeRepository.save(gameType);
        }
        return null;
    }

    public void deleteGameType(Long id) {
        gameTypeRepository.deleteById(id);
    }

}
