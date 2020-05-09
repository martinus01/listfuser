package com.example.listfuser;

import java.util.List;

public class Launch {
    private String name;
    private String windowstart;
    private String windowend;
    private List<Location> locations;
    private List<Rocket> rockets;
    private List<Missions>missions;


    public String getWindowstart() {
        return windowstart;
    }

    public String getName() {
        return name;
    }

    public String getWindowend() {
        return windowend;
    }
    public List<Location> getLocation(){
        return locations;
    }

    public List<Missions> getMissions() {
        return missions;
    }

    public List<Rocket> getRockets() {
        return rockets;
    }
}
