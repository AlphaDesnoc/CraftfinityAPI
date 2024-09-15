package fr.craftfinity.services;

import fr.craftfinity.models.InfinityGroup;
import fr.craftfinity.repositories.InfinityGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfinityGroupService {

    @Autowired
    private InfinityGroupRepository infinityGroupRepository;

    public List<InfinityGroup> getAllInfinityGroups() {
        return infinityGroupRepository.findAll();
    }

    public InfinityGroup getInfinityGroupById(Long id) {
        return infinityGroupRepository.findById(id).orElse(null);
    }

    public InfinityGroup createInfinityGroup(InfinityGroup infinityGroup) {
        return infinityGroupRepository.save(infinityGroup);
    }

    public InfinityGroup updateInfinityGroup(Long id, InfinityGroup infinityGroupDetails) {
        InfinityGroup infinityGroup = infinityGroupRepository.findById(id).orElse(null);
        if (infinityGroup != null) {
            infinityGroup.setName(infinityGroupDetails.getName());
            infinityGroup.setDescription(infinityGroupDetails.getDescription());
            return infinityGroupRepository.save(infinityGroup);
        }
        return null;
    }

    public void deleteInfinityGroup(Long id) {
        infinityGroupRepository.deleteById(id);
    }

}
