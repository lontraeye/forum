package br.com.lontra.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lontra.forum.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}