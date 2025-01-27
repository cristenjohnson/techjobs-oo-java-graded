package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.test.JobTest;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private static String name;
    private static Employer employer;
    private static Location location;
    private static PositionType positionType;
    private static CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public static Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public static CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        if(name.isEmpty()){
            setName("Data not available");
        }
        if(employer.getValue().isEmpty()){
            employer.setValue("Data not available");
        }
        if(location.getValue().isEmpty()){
            location.setValue("Data not available");
        }
        if(positionType.getValue().isEmpty()){
            positionType.setValue("Data not available");
        }
        if(coreCompetency.getValue().isEmpty()){
            coreCompetency.setValue("Data not available");
        }
        return "ID: "+ id +
                "\n"+ "Name: "+ name +
                "\n"+ "Employer: " + employer +
                "\n"+ "Location: " + location +
                "\n"+ "Position Type: " + positionType +
                "\n"+ "Core Competency: " + coreCompetency;
    }

//if (dataOne.getId() == (dataTwo.getId())) {
//        System.out.println(dataOne.getId() + "equals " + dataTwo.getId());
//    } else System.out.println("Not equal");
}