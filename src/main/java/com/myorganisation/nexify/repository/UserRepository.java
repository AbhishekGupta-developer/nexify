package com.myorganisation.nexify.repository;

import com.myorganisation.nexify.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private Long userId = 0L;

    public Map<Long, User> userMap = new HashMap<>();

    public Long generateUserId() {
        return ++userId;
    }
}
