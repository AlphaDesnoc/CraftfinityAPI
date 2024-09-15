package fr.craftfinity.services;

import fr.craftfinity.models.InfinityMoney;
import fr.craftfinity.models.InfinityMoney;
import fr.craftfinity.repositories.InfinityMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class InfinityMoneyService {
    
    @Autowired
    private InfinityMoneyRepository infinityMoneyRepository;

    public List<InfinityMoney> getAllInfinityMoneys() {
        return infinityMoneyRepository.findAll();
    }

    public InfinityMoney getInfinityMoneyById(Long id) {
        return infinityMoneyRepository.findById(id).orElse(null);
    }

    public InfinityMoney createInfinityMoney(InfinityMoney infinityMoney) {
        return infinityMoneyRepository.save(infinityMoney);
    }

    public InfinityMoney updateInfinityMoney(Long id, InfinityMoney InfinityMoneyDetails) {
        InfinityMoney infinityMoney = infinityMoneyRepository.findById(id).orElse(null);
        if (infinityMoney != null) {
            infinityMoney.setMoneyName(InfinityMoneyDetails.getMoneyName());
            infinityMoney.setCurrency(InfinityMoneyDetails.getCurrency());
            return infinityMoneyRepository.save(infinityMoney);
        }
        return null;
    }

    public void deleteInfinityMoney(Long id) {
        infinityMoneyRepository.deleteById(id);
    }

}
