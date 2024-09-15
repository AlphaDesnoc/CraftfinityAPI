package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityPermissionRepository extends JpaRepository<InfinityPermission, Long> {}
