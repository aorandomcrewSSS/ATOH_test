package com.test.ATOH.entity;


import com.test.ATOH.entity.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer accountNumber;

    private String name;

    private String lastName;

    private String surName;

    private LocalDate birthDate;

    private Integer inn;

    private String userName;

    @Enumerated(EnumType.STRING)
    private Status status;
}
