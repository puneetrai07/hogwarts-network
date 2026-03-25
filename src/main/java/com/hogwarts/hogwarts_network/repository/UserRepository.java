package com.hogwarts.hogwarts_network.repository;

import com.hogwarts.hogwarts_network.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}