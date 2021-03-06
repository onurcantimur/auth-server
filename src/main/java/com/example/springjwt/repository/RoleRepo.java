package com.example.springjwt.repository;

import com.example.springjwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepo extends JpaRepository<Role, Short> {

    Role findByName(String name);

    List<Role> findAllByOrderById();
}
