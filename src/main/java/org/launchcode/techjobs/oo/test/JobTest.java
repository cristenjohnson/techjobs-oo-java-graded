package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest extends Job {

    @Test
    public void testSettingJobId() {
        Job one = new Job();
        Job two = new Job();
        assertNotEquals(one.getId(), two.getId());

    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job data = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", data.getName());
        assertEquals("ACME", data.getEmployer().getValue());
        assertEquals("Desert", data.getLocation().getValue());
        assertEquals("Quality control", data.getPositionType().getValue());
        assertEquals("Persistence", data.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job dataOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job dataTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(dataOne.equals(dataTwo));

//        public boolean equals(Object toBeCompared) {
//            Student theStudent = (Student) toBeCompared;
//            return theStudent.getStudentId() == getStudentId();
//        }
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
         String output = "ID: " + job2.getId() + "\n" +
         "Name: Web Developer" + "\n" +
         "Employer: LaunchCode" + "\n" +
         "Location: St. Louis" + "\n" +
         "Position Type: Front-end developer" + "\n" +
         "Core Competency: JavaScript";
         assertEquals(output, job2.toString());

        //String expected = how you expect your string to come out in the console
        //String actual = dataTwo.toString();
        //write assert statement comparing the two; how do you access the values
        //of parameters into a formula


    }


    @Test
    public void testToStringHandlesEmptyField() {
        // What if one of the fields is empty?
        //Job job2 = new Job("", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        // ID:  1
        // Name: Data not available *****
        // Employer: LaunchCode
        // Location: St. Louis
        // Position Type: Front-end developer
        // Core Competency: JavaScript
        Job job2 = new Job("", new Employer(""), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        String output = "ID: " + job2.getId() + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: St. Louis" + "\n" +
                "Position Type: Front-end developer" + "\n" +
                "Core Competency: JavaScript";
        assertEquals(output, job2.toString());
        //all labels need to still be there and values do as well
        //same set up as test above and
        //easiest way to do this is a series of if statements
    }
}
