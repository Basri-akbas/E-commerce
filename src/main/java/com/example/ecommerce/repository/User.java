package com.example.ecommerce.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface User extends JpaRepository<com.example.ecommerce.entity.User,Long> {


}
