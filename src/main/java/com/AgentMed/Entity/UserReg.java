package com.AgentMed.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "WholeSellerReg")
public class UserReg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Size(min=0,max=10)
    private long mobNo;
    @Email
    @NotEmpty
    private String email;

    @Column(unique = true)
    private String gstNo;
    @Column(unique = true)
    private Long licNo;
    @Enumerated(EnumType.STRING)
    private userType type;
}
