package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityPlayerRepository extends JpaRepository<InfinityPlayer, Long>{}