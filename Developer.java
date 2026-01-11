package com.Developer;


public class Developer {
    String name;

    public Developer(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is performing general development tasks.");
    }

    void describeProject() {
        System.out.println(name + " is working on a standard software module.");
    }
    
    void childSpecific() {
    	System.out.println("Developer.");
    }
}