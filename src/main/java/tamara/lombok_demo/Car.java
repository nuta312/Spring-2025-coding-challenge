package tamara.lombok_demo;

import lombok.*;

import java.util.Objects;
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

