package com.company.src.com.company;

public class Bank {

    private String name;
    private Integer rating;

    // •••••••••••••••••••••• GETERI un SETERI •••••••••••••••••••••••••••••••••

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }


        // •••••••••••••••••  GENERATE to STRING   •••••••••••••••••••••••••••


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public void setRating(Integer rating) {
        this.rating = rating;

        // •••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

    }
}
