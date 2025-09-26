package com.social.network.repository;

import com.social.network.entity.Follower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepo extends JpaRepository<Follower,Long> {
}
