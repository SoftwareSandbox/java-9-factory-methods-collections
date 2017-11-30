package com.softwaresandbox.java9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    private static final String CAR_COLOR = "Black";

    @Test
    void thisCar() {
        Car car = new Car("Black", List.of("Heated seats", "Park assist"));
        assertThat(car.getColor()).isEqualTo(CAR_COLOR);
    }
}