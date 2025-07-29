package com.spring2025.codingbat.tugolbai.lombok_demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Car {

    private String model;
    private int year;
    private String color;
    private String engine;

}
