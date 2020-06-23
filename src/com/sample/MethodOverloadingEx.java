package com.sample;

public class MethodOverloadingEx {

    public String methodOne(String name){
        System.out.println("Inside method" + name);
        String value = name + "course";
        return value;//jovatpointcourse
    }
    public String methodOne(String fName,String lName){
        System.out.println("Inside method" + fName);
        String fullName = fName + lName;
        return fullName;//jovatpointcourse
    }


    public static void main(String[] args) {
        MethodOverloadingEx ex = new MethodOverloadingEx();
        String fName = "Nageswar";
        String lName = "reddy";
        System.out.println(ex.methodOne(fName,lName));
    }
}
