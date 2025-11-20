package com.myorganisation.nexify.repository;

import com.myorganisation.nexify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom finder methods
    User findByUsername(String username);
    List<User> findByUsernameContaining(String username);
}
