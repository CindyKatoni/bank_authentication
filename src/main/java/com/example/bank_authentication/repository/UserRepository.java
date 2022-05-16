package com.example.bank_authentication.repository;

import com.example.bank_authentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //Define common CRUD operations
}
