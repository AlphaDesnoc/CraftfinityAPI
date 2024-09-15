package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityMoneyRepository extends JpaRepository<InfinityMoney, Long> {}
