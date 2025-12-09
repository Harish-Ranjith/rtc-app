package com.project.identity_service.repository;

import com.project.identity_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Empty! JpaRepository gives us save(), findAll(), delete() for free.
}