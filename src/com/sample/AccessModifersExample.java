package com.sample;

public class AccessModifersExample {

    private  int id;
    private  String firstName;
    private boolean active;
    private long longId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static void main(String[] args) {

         AccessModifersExample a = new AccessModifersExample();
        System.out.println(a.getId());
        // a.setFirstName("AA");
         a.setId(2);
         a.setActive(true);

        System.out.println(a.getId());
       // System.out.println(AccessModifersExample.id);
        AccessModifersExample b = new AccessModifersExample();
        //b.setFirstName("BB");
        b.setId(3);
        b.setActive(true);

    }
}
