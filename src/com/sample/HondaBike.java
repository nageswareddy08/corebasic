package com.sample;

public class HondaBike implements BikeInterface {
    @Override
    public String bikeModel() {
        return "HONDA_201";
    }

    public static void main(String[] args) {
        HondaBike hondaBike = new HondaBike();
        System.out.println(hondaBike.bikeModel());
    }
}
