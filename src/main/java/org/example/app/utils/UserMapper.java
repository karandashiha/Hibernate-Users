package org.example.app.utils;

import org.example.app.entity.User;

import java.util.Map;

public class UserMapper {

    public User mapUserData(Map<String, String> data) {
        User user = new User();
        if (data.containsKey("id"))
            user.setId(Long.parseLong(data.get("id")));
        if (data.containsKey("first_name"))
            user.setFirstName(data.get("first_name"));
        if (data.containsKey("last_name"))
            user.setLastName(data.get("last_name"));
        if (data.containsKey("email"))
            user.setEmail(data.get("email"));
        return user;
    }
}
