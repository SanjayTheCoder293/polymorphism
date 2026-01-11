package com.Developer;


public class JavaDeveloper extends Developer {
    
    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is writing robust Backend code using Java.");
    }

    @Override
    void describeProject() {
        System.out.println(name + " is building a scalable Microservices API.");
    }
    
    void childSpecific() {
    	System.out.println("JavaProgrammer");
    }
}
