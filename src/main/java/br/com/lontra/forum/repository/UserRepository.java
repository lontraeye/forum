package br.com.lontra.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.lontra.forum.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByUsername(String username);
}