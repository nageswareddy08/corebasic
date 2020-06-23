package com.sample;

public class Mobile {

    private Integer id;
    private String model;
    private String name;

    public Mobile(Integer id,String name) {
        System.out.println(id+" &&& "+name);
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

