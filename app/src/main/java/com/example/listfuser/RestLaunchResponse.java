package com.example.listfuser;

import java.util.List;

public class RestLaunchResponse {
    private List<Launch> launches;
    private Integer total;
    private Integer count;
    private List<Locations> locations;

    public List<Launch> getLaunches() {
        return launches;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getCount() {
        return count;
    }
}
