package com.sample;

public class Honda extends Bike {

    @Override
    String bikeCompany() {
        return "Honda";
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        System.out.println(honda.bikeCompany());
        System.out.println(honda.bikeModelNumber());
    }
}
