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
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long follower_id;
     private Long user_id; // (FK->User.user_id)
     private Long follower_user_id; // (FK->User.user_id)
     private Date created_at;
}
