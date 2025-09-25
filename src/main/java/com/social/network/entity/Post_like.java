package com.social.network.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post_like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long like_id;

    private Long post_id; // (FK->Post.post_id)
    private Long user_id; // (FK->User.user_id)
    private Date created_at;
}
