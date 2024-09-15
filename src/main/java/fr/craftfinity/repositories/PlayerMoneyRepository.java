package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityFriend;
import fr.craftfinity.models.PlayerMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerMoneyRepository extends JpaRepository<PlayerMoney, Long> {}
