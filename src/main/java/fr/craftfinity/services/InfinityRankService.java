package fr.craftfinity.services;

import fr.craftfinity.models.InfinityRank;
import fr.craftfinity.repositories.InfinityRankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class InfinityRankService {

    @Autowired
    private InfinityRankRepository rankRepository;

    public List<InfinityRank> getAllRanks() {
        return rankRepository.findAll();
    }

    public InfinityRank getRankByID(Long id) {
        return rankRepository.findById(id).orElse(null);
    }

    public InfinityRank createRank(InfinityRank rank) {
        return rankRepository.save(rank);
    }

    public InfinityRank updateRank(Long id, InfinityRank rankDetails) {
        InfinityRank rank = rankRepository.findById(id).orElse(null);
        if (rank != null) {
            rank.setRankname(rankDetails.getRankname());
            rank.setPrefix(rankDetails.getPrefix());
            rank.setDescription(rankDetails.getDescription());
            return rankRepository.save(rank);
        }
        return null;
    }

    public void deleteRank(Long id) {
        rankRepository.deleteById(id);
    }

}
