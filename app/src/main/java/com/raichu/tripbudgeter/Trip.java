package com.raichu.tripbudgeter;

import java.util.ArrayList;
import java.util.Date;

public class Trip {

    private String name;
    private Date startDate, endDate;
    private ArrayList<Purchase> purchases = new ArrayList<>();
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Float> balances = new ArrayList<>();

    private Trip(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public float getBalance(Person person) {
        return balances.get(people.indexOf(person));
    }

    public float changeBalance(Person person, float change) {
        int index = people.indexOf(person);
        balances.set(index, balances.get(index) + change);

        return balances.get(index);
    }

}
