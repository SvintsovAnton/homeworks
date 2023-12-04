package de.ait.enums;

public enum Seasons {

    WINTER("холодно"), SPRING("тепло"), SUMMER("жарко"), AUTHUM("сыро");

    private final String description;
    Seasons(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
