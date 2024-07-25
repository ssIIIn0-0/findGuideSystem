package com.example.findguide.repository;

import com.example.findguide.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByTitle(String title);
}
