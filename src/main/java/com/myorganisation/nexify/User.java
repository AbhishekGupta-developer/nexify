package com.myorganisation.nexify;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String username;
    private String password;
}
