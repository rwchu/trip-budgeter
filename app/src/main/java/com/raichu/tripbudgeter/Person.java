package com.raichu.tripbudgeter;

public class Person {
    private String name;
    private int imageResourceId;

    public static final Person[] people = {
            new Person("Tim", R.drawable.tim)
    };

    private Person(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
