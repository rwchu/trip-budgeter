package com.raichu.tripbudgeter;

import java.util.Date;

public class Purchase {
    private String description, buyer, payer;
    private float price;
    private Date date;

    public static final Purchase[] purchases = {
            new Purchase("Souvenir", new Date(1531455851000L), 15.0f, "Tim", "All")
    };

    private Purchase(String description, Date date, float price, String buyer, String payer) {
        this.description = description;
        this.date = date;
        this.price = price;
        this.buyer = buyer;
        this.payer = payer;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getPayer() {
        return payer;
    }

}
