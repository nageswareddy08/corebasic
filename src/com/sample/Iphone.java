package com.sample;

public class Iphone extends Mobile{
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Iphone(Integer id, String name, String price) {
        super(id, name);
        this.price = price;
        System.out.println(id+" @@@ "+name);
    }

    public static void main(String[] args) {
        Iphone mobile = new Iphone(1,"iPone","1000");
        System.out.println(mobile.getId()+" - "+mobile.getName()+" "+mobile.getPrice());

    }
}
