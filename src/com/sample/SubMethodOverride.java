package com.sample;

public class SubMethodOverride extends MethodOverideEx {
    @Override
    public String methodOne() {
        return "submethodOne";
    }

    public static void main(String[] args) {
        SubMethodOverride subMethodOverride = new SubMethodOverride();
        System.out.println(subMethodOverride.methodOne());
    }
}
