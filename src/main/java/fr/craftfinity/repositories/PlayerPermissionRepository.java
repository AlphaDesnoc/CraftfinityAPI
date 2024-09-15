package fr.craftfinity.repositories;

import fr.craftfinity.models.PlayerPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerPermissionRepository extends JpaRepository<PlayerPermission, Long>  {}