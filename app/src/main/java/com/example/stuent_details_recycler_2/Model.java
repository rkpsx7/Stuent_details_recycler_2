package com.example.stuent_details_recycler_2;

public class Model {
    String name,id,address,dob;

    public Model(String name, String id, String address, String dob) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }
}
