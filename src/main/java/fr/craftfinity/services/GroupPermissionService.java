package fr.craftfinity.services;

import fr.craftfinity.models.GroupPermission;
import fr.craftfinity.models.InfinityPlayer;
import fr.craftfinity.repositories.GroupPermissionRepository;
import fr.craftfinity.repositories.InfinityPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class GroupPermissionService {

    @Autowired
    private GroupPermissionRepository groupPermissionRepository;

    public List<GroupPermission> getAllGroupPermission() {
        return groupPermissionRepository.findAll();
    }

    public GroupPermission getGroupPermissionById(Long id) {
        return groupPermissionRepository.findById(id).orElse(null);
    }

    public GroupPermission createGroupPermission(GroupPermission groupPermission) {
        return groupPermissionRepository.save(groupPermission);
    }

    public GroupPermission updateGroupPermission(Long id, GroupPermission groupPermissionDetails) {
        GroupPermission groupPermission = groupPermissionRepository.findById(id).orElse(null);
        if (groupPermission != null) {
            groupPermission.setGroupid(groupPermissionDetails.getGroupid());
            groupPermission.setPermissionid(groupPermissionDetails.getPermissionid());
            return groupPermissionRepository.save(groupPermission);
        }
        return null;
    }

    public void deleteGroupPermission(Long id) {
        groupPermissionRepository.deleteById(id);
    }

}
