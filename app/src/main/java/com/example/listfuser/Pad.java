package com.example.listfuser;

import java.util.List;

public class Pad {
    private String name;
    private String latitude;
    private String  longitude;
    private List<Agencies> agencies;


    public String getName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public List<Agencies> getAgencies() {
        return agencies;
    }
}
