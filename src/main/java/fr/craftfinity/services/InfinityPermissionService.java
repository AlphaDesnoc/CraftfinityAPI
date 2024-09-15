package fr.craftfinity.services;

import fr.craftfinity.models.InfinityPermission;
import fr.craftfinity.repositories.InfinityPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class InfinityPermissionService {

    @Autowired
    private InfinityPermissionRepository infinityPermissionRepository;

    public List<InfinityPermission> getAllInfinityPermissions() {
        return infinityPermissionRepository.findAll();
    }

    public InfinityPermission getInfinityPermissionById(Long id) {
        return infinityPermissionRepository.findById(id).orElse(null);
    }

    public InfinityPermission createInfinityPermission(InfinityPermission infinityPermission) {
        return infinityPermissionRepository.save(infinityPermission);
    }

    public InfinityPermission updateInfinityPermission(Long id, InfinityPermission infinityPermissionDetails) {
        InfinityPermission infinityPermission = infinityPermissionRepository.findById(id).orElse(null);
        if (infinityPermission != null) {
            infinityPermission.setPermission(infinityPermissionDetails.getPermission());
            infinityPermission.setAuthorized(infinityPermissionDetails.isAuthorized());
            return infinityPermissionRepository.save(infinityPermission);
        }
        return null;
    }

    public void deleteInfinityPermission(Long id) {
        infinityPermissionRepository.deleteById(id);
    }
    
}
