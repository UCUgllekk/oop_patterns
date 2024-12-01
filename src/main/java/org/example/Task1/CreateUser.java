package org.example.Task1;

import java.util.List;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@SuperBuilder
public class CreateUser extends User {
    @Singular
    private List<Integer> grades;
}
