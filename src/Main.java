// Name: Boris Alemnka
// Course: CEN 3024C - CRN33022 - Software Development 1
//Date: 5/23/2024
//Class Name: Main

import librarybooks.Books;
//Import libraryCourses.Course;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static <Course> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     // We had to import a scanner to prompt user input
        System.out.print("Login by entering your name: ");    // this is acting as a login screen for user
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + ", you are now signed in");    // Upon login, a welcome message displays

        Books book1 = new Books();

        book1.setBookId(1); //    Assigning appropriate variables as declared in our class (Books.java)
        book1.setBookTitle("When Rain Clouds Gather");
        book1.setBookAuthor("Bessie Head");

        Books book2 = new Books();
        book2.setBookId(2);           //Doing same as above for the second book entry and so on...
        book2.setBookTitle("Things Fall Apart");
        book2.setBookAuthor("Chinua Achebe");

        Books book3 = new Books();
        book3.setBookId(3);
        book3.setBookTitle("The Black Cat");
        book3.setBookAuthor("Edgar Allan Poe");

        Books book4 = new Books();
        book4.setBookId(4);
        book4.setBookTitle("The Mother Hen");
        book4.setBookAuthor("Jemimah A. Admas");

        System.out.print("Would you like to check out our book collection? ");
        String userInput1 = scanner.nextLine();
        System.out.println();

        if (Objects.equals(userInput1, "Yes")) {       // if user answers yes to the question then they can browse the books
            System.out.print("Enter your book title or author's name: ");
            String userInput2 = scanner.nextLine();     // the ability for user to search for each book by it's title

            if (Objects.equals(userInput2, "The Mother Hen"))   // nested if statements all the user to find any of these
                book4.printBookInfo();                   //based on their "Yes" response to the book collection question.
            //else {
            if (Objects.equals(userInput2, "When Rain Clouds Gather"))
                book1.printBookInfo();
            //else {
            if (Objects.equals(userInput2, "Things Fall Apart"))
                book2.printBookInfo();
            //else {
            if (Objects.equals(userInput2, "The Black Cat"))
                book3.printBookInfo();
            //else {
            if (Objects.equals(userInput2, "Bessie Head"))
                book1.printBookInfo();
            //else {
            if (Objects.equals(userInput2, "Chinua Achebe"))
                book2.printBookInfo();
            //else {
            if (Objects.equals(userInput2, "Jemimah Admas"))
                book4.printBookInfo();
            //else {
            if (Objects.equals(userInput2, "Edgar Allan Poe"))
                book3.printBookInfo();
        }
        else {
            System.out.println("Your input is invalid"); }  // the ending else statement which will display
            //if (Objects.equals(userInput1, "No"))            //if the proper book title or author is not inputed.
            System.out.println();
            System.out.print("Would you also like to check out our courses? ");  //They they can shoose to lookup
            String userInput3 = scanner.nextLine();                         // any courses that the library offers
        System.out.println();
            LibraryCourses course1 = new LibraryCourses();
            LibraryCourses course2 = new LibraryCourses();
            LibraryCourses dateTime2 = new LibraryCourses();

            course1.setCourseID(111); //    Assigning appropriate variables as declared in our class (LibraryCourses.java)
        course1.setCourseTitle("Email Creation");
        course1.setInstructor("Johnson Doe");
        course1.setCourseDateTime("05/30/2024: 10:00 - 11:00 AM");
        course1.setBuildingRoom("1-101");

        course2.setCourseID(222);
        course2.setCourseTitle("Microsoft Excel");
        course2.setInstructor("James Bond");
        course2.setCourseDateTime("05/30/2024: 10:00 - 11:00 AM");
        course2.setBuildingRoom("1-105");

        if (Objects.equals(userInput3, "Yes")) {
            course1.printCourseInfo();
            System.out.println();
            course2.printCourseInfo();
            System.out.print("Would you like to checkout out grades K-5 free tutoring sessions schedule? ");
            String userInout4 = scanner.nextLine();}
        else {
            System.out.print("Would you like to checkout out grades K-5 free tutoring sessions schedule? ");
            String userInput5 = scanner.nextLine();
        }
    }
}
                    //if (Objects.equals(userInput3, "Yes")) {


            //if (Objects.equals(response, "No")) {
                //System.out.println("Would you like to check out our courses? ");
            //}
            //if (Objects.equals(response, "No")){
            // System.out.println("Would you like to check out our courses? ");








    //book1.printBookInfo();

        //if (bookTitle == "When Rain Clouds Gather") {
            //book1.printBookInfo();
        //else {
            //System.out.println("You entered the wrong information. Try again");
           // }
        //}
    //String name = scanner.nextLine();

    //System.out.println(get)
