package com.Developer;


public class PythonDeveloper extends Developer {

    public PythonDeveloper(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is writing scripts and processing data.");
    }

    @Override
    void describeProject() {
        System.out.println(name + " is developing a Machine Learning model.");
    }
    
    void childSpecific() {
    	System.out.println("pythonProgrammer");
    }
}