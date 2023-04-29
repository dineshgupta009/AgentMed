package com.AgentMed.repository;

import com.AgentMed.Entity.UserReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserReg,Long> {


}
