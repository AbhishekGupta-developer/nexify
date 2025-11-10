package com.myorganisation.nexify.model;

import com.myorganisation.nexify.enums.Gender;
import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;
    private Gender gender;
}
