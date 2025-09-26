package com.social.network.repository;

import com.social.network.entity.Post_like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Post_like_Repo extends JpaRepository<Post_like,Long> {
}
