package fr.craftfinity.services;

import fr.craftfinity.models.InfinityPlayer;
import fr.craftfinity.repositories.InfinityPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InfinityPlayerService {
    @Autowired
    private InfinityPlayerRepository corePlayerRepository;

    public List<InfinityPlayer> getAllPlayers() {
        return corePlayerRepository.findAll();
    }

    public InfinityPlayer getPlayerById(Long id) {
        return corePlayerRepository.findById(id).orElse(null);
    }

    public InfinityPlayer createPlayer(InfinityPlayer player) {
        return corePlayerRepository.save(player);
    }

    public InfinityPlayer updatePlayer(Long id, InfinityPlayer playerDetails) {
        InfinityPlayer player = corePlayerRepository.findById(id).orElse(null);
        if (player != null) {
            player.setPlayername(playerDetails.getPlayername());
            player.setSurname(playerDetails.getSurname());
            player.setUuid(playerDetails.getUuid());
            player.setPlayerrank(playerDetails.getPlayerrank());
            return corePlayerRepository.save(player);
        }
        return null;
    }

    public void deletePlayer(Long id) {
        corePlayerRepository.deleteById(id);
    }
}