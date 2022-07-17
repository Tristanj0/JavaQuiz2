package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    private Map<String, String> map = new HashMap<>();
    public Router() { this.map = new LinkedHashMap<>(); }


    public void add(String path, String controller) {
       this.map.put(path, controller);
    }

    public Integer size() {
        return this.map.size();
    }

    public String getController(String path) {
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
}
