package com.social.network.repository;

import com.social.network.entity.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendshipRepo extends JpaRepository<Friendship,Long> {

}
