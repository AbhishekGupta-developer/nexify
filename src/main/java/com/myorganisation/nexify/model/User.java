package com.myorganisation.nexify.model;

import com.myorganisation.nexify.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
