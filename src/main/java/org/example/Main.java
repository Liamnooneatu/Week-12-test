package org.example;
import javax.swing.filechooser.FileView;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner StudentInput = new Scanner(System.in);

            System.out.println("Please Enter Your Name:");
            String StudentName = StudentInput.nextLine();

            System.out.println("Please Enter Your Student ID Number:");
            String StudentNumber = StudentInput.nextLine();

            System.out.println("Please Enter Your Age:");
            String StudentAge = StudentInput.nextLine();

            System.out.println("Please Enter Your Address:");
            String StudentAddress = StudentInput.nextLine();

            Student firstStudent = new Student();
            firstStudent.setName(StudentName);
            firstStudent.setAddress(StudentAddress);

            System.out.println("Here are your details:");
            System.out.println("Name:"+ StudentName);
            System.out.println("Student Number:" + StudentNumber);
            System.out.println("Age:" + StudentAge);
            System.out.println("Address:" + StudentAddress + "\n");


            System.out.println("Please enter a Filename for the creation of a new Pom File:\n");
          /*  class FileWriter{
            FileWriter = ;
            FileReader;
            }
          */

            System.out.println("Thank You, your details have now been saved to the File");
        }
    }


