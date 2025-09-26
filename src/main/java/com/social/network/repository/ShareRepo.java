package com.social.network.repository;

import com.social.network.entity.Share;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareRepo extends JpaRepository<Share,Long> {
}
