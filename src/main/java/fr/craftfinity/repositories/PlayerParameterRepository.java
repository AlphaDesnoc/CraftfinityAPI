package fr.craftfinity.repositories;

import fr.craftfinity.models.PlayerParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerParameterRepository extends JpaRepository<PlayerParameter, Long> { }
