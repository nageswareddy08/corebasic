package com.sample;

public class BajajBike implements BikeInterface {
    @Override
    public String bikeModel() {
        return "Bajaj_301";
    }

    public static void main(String[] args) {
        BajajBike bajajBike = new BajajBike();
        System.out.println(bajajBike.bikeModel());
    }
}
