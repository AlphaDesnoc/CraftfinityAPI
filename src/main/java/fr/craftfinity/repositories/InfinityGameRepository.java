package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityGameRepository extends JpaRepository<InfinityGame, Long> {}
