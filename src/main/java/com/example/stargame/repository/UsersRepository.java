package com.example.stargame.repository;

import com.example.stargame.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    boolean existsByNameAndEmail(String name, String email);
    boolean existsById(Integer id);
}
