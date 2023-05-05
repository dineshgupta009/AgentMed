package com.AgentMed.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
@Table(name = "WholeSellerReg")
public class UserReg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(unique = true)
    private long phoneNumber;
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    private String email;

    @Column(unique = true)
    private String gstNo;
    @Column(unique = true)
    private Long licNo;
    @Enumerated(EnumType.STRING)
    private userType type;
}
