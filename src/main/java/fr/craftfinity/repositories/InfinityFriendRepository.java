package fr.craftfinity.repositories;

import fr.craftfinity.models.InfinityFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityFriendRepository extends JpaRepository<InfinityFriend, Long> {}
