package fr.craftfinity.services;

import fr.craftfinity.models.InfinityGame;
import fr.craftfinity.repositories.InfinityGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class InfinityGameService {

    @Autowired
    private InfinityGameRepository infinityGameRepository;

    public List<InfinityGame> getAllInfinityGames() {
        return infinityGameRepository.findAll();
    }

    public InfinityGame getInfinityGameById(Long id) {
        return infinityGameRepository.findById(id).orElse(null);
    }

    public InfinityGame createInfinityGame(InfinityGame infinityGame) {
        return infinityGameRepository.save(infinityGame);
    }

    public InfinityGame updateInfinityGame(Long id, InfinityGame infinityGameDetails) {
        InfinityGame infinityGame = infinityGameRepository.findById(id).orElse(null);
        if (infinityGame != null) {
            infinityGame.setServername(infinityGameDetails.getServername());
            infinityGame.setMapname(infinityGameDetails.getMapname());
            infinityGame.setGametypeid(infinityGameDetails.getGametypeid());
            infinityGame.setStarttime(infinityGameDetails.getStarttime());
            infinityGame.setEndtime(infinityGameDetails.getEndtime());
            return infinityGameRepository.save(infinityGame);
        }
        return null;
    }

    public void deleteInfinityGame(Long id) {
        infinityGameRepository.deleteById(id);
    }
    
}
