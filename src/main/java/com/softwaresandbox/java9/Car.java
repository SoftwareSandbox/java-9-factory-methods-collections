package com.softwaresandbox.java9;

import java.util.Collection;

public class Car {

    private String Color;
    private Collection<String> Options;

    public Car(String color, Collection<String> options) {
        Color = color;
        Options = options;
    }

    public String getColor() {
        return Color;
    }

    public Collection<String> getOptions() {
        return Options;
    }
}
