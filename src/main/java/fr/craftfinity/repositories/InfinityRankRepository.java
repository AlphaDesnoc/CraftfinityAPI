package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityRankRepository extends JpaRepository<InfinityRank, Long> {}