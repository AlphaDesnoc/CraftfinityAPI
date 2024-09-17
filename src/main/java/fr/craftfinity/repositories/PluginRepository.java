package fr.craftfinity.repositories;

import fr.craftfinity.models.Plugin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PluginRepository extends JpaRepository<Plugin, Long> {
    Plugin findByPluginid(String pluginId);
}