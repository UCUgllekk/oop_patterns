package org.example.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = CreateUser.builder().name("Oles")
                .age(32)
                .gender(Gender.valueOf("MALE"))
                .grades(List.of(61, 62))
                .build();
        System.out.println(user);
    }
}
