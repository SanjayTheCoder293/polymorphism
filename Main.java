package com.Developer;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // We use the Superclass type (Developer) to hold different objects
        ArrayList<Developer> team = new ArrayList<>();

        team.add(new JavaDeveloper("Alice"));
        team.add(new PythonDeveloper("Bob"));
        team.add(new Developer("Charlie")); // A general dev

        System.out.println("=== Starting Team Sprint ===\n");

        for (Developer dev : team) {
            assignDailyTask(dev);
            System.out.println("---------------------------");
        }
    }

    // This method demonstrates Polymorphism
    // It takes a 'Developer' but executes the CHILD'S specific method
    public static void assignDailyTask(Developer dev) {
        dev.work();
        dev.describeProject();
        
        if (dev instanceof JavaDeveloper) {
        	((JavaDeveloper)(dev)).childSpecific();
        } else if (dev instanceof PythonDeveloper) {
        	((PythonDeveloper)(dev)).childSpecific();
        } else  {
        	((Developer)(dev)).childSpecific();
        }
    }
}