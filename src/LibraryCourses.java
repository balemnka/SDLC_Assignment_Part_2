// Name: Boris Alemnka
// Course: CEN 3024C - CRN33022 - Software Development 1
//Date: 5/23/2024
//Class Name: LibraryCourses

import java.util.Date;

public class LibraryCourses {
    private int courseID;             //We declare our variables (fields) for this class
    private String BuildingRoom;
    private String courseTitle;
    private String instructor;
    private String courseDateTime;

    public void setCourseID (int courseNum) {
        courseID = courseNum;
    }   // setting up our setters and getters
    public int getCourseID() {
        return courseID;
    }
    public void setCourseTitle (String courseName) {
        courseTitle = courseName;
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public void setInstructor (String instructorName) {
        instructor = instructorName;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setCourseDateTime (String dateTime) {
        courseDateTime = dateTime;
    }

    public String getCourseDateTime() {
        return courseDateTime;
    }
    public void setBuildingRoom(String roomNumber) {
        BuildingRoom = roomNumber;
    }

    public String getBuildingRoom() {
        return BuildingRoom;
    }

    public void printCourseInfo() {     //This is a print method that would allow display of all courses in one view
        System.out.println("Course Information:");
        System.out.println("Course Id: " + courseID);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Instructor: " + instructor);
        System.out.println("Course Schedule Date and Time: " + courseDateTime);
        System.out.println("Building-Room Number: " + BuildingRoom);
    }

}
