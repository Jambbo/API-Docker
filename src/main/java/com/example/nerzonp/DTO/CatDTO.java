package com.example.nerzonp.DTO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CatDTO {
        String name;
        int weight;
        int age;
}
