package fr.craftfinity.repositories;

import fr.craftfinity.models.PlayerGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerGroupsRepository extends JpaRepository<PlayerGroups, Long> {}
