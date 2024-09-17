package fr.craftfinity.services;

import fr.craftfinity.models.Plugin;
import fr.craftfinity.repositories.PluginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PluginService {

    private final PluginRepository pluginRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public PluginService(PluginRepository pluginRepository, PasswordEncoder passwordEncoder) {
        this.pluginRepository = pluginRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean verifyPlugin(String pluginId, String secretKey) {
        Plugin plugin = pluginRepository.findByPluginid(pluginId);
        if (plugin == null) {
            return false;
        }
        return passwordEncoder.matches(secretKey, plugin.getSecret_key());
    }

    public void registerPlugin(Plugin plugin) {
        String encodedSecretKey = passwordEncoder.encode(plugin.getSecret_key());
        plugin.setSecret_key(encodedSecretKey);
        pluginRepository.save(plugin);
    }
}