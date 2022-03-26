package com.javarians.javarians.student;

import lombok.*;

import java.time.LocalDate;
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Student {

    private Long Id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
}
