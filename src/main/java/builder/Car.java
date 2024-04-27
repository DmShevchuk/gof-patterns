package builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private String engine;
    private int seats;
    private String color;
    private String transmission;
}
