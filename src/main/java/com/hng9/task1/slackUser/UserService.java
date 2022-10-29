package com.hng9.task1.slackUser;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser() {
        return new User(
                "Busayo Dada",
                true,
                27,
                "I am a Java and JavaScript backend developer."

        );

    }

}
