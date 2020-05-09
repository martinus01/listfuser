package com.example.listfuser;

import java.util.List;

public class Rocket {
    private List<Agencies> agenciesrocket;
    private String name;
    private String configuration;
    private String familyname;

    public String getFamilyname() {
        return familyname;
    }

    public String getConfiguration() {
        return configuration;
    }

    public String getName() {
        return name;
    }

    public List<Agencies> getAgenciesrocket() {
        return agenciesrocket;
    }
}
