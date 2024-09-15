package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityGroupRepository extends JpaRepository<InfinityGroup, Long> {
}