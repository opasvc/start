package com.start.start.pojo;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString

public class User {

    private Integer id;
    private String name;
    private String listId;
    private Cat cat;
    private LocalDate date;
}
