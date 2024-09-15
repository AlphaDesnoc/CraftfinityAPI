package fr.craftfinity.repositories;

import fr.craftfinity.models.PlayerPlayedGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerPlayedGameRepository extends JpaRepository<PlayerPlayedGame, Long> {}