package com.AgentMed.repository;

import com.AgentMed.Entity.UserReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRegRepository extends JpaRepository<UserReg,Long> {
    Optional<UserReg> findByPhoneNumber(Long phoneNumber);
}
