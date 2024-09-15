package fr.craftfinity.repositories;

import fr.craftfinity.models.GroupPermission;
import fr.craftfinity.models.InfinityPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPermissionRepository extends JpaRepository<GroupPermission, Long> {}