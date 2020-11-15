package com.Rohith;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        home_menu();
    }
    public static void home_menu(){
        Scanner scan = new Scanner(System.in);
        Calculate c = new Calculate();
        Search s = new Search();
        System.out.println("**********Student Attendence Tracker*********");
        System.out.println("1. Details by student Name");
        System.out.println("2. Details by student ID");
        System.out.println("3. Details by subject");
        System.out.println("4. Details by subject and student Name");
        System.out.println("5. Calculate present percentage of students by Name");
        System.out.println("6. Calculate present percentage of students by ID");
        System.out.println("7. Calculate present percentage of a subject");
        System.out.println("8. List the students with less percentage in subject");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.print("\n\n");
                System.out.println("Enter the Student Name: ");
                scan.nextLine();
                String name = scan.nextLine();
                s.byName(name);
                break;
            case 2:
                System.out.print("\n\n");
                System.out.println("Enter the Student ID: ");
                scan.nextLine();
                String id = scan.nextLine();
                s.byId(id);
                break;
            case 3:
                System.out.print("\n\n");
                System.out.println("Enter the Subject: ");
                scan.nextLine();
                String sub = scan.nextLine();
                s.bySubject(sub);
                break;
            case 4:
                System.out.print("\n\n");
                System.out.println("Enter the Subject: ");
                scan.nextLine();
                sub = scan.nextLine();
                System.out.println("Enter the Student name: ");
                scan.nextLine();
                name = scan.nextLine();
                s.bySubject(sub,name);
                break;
            case 5:
                System.out.println("\n\n");
                System.out.println("Enter the Student Name: ");
                scan.nextLine();
                name = scan.nextLine();
                c.prsntByName(name);
                break;
            case 6:
                System.out.print("\n\n");
                System.out.println("Enter the Student ID: ");
                scan.nextLine();
                id = scan.nextLine();
                c.prsntByID(id);
                break;
            case 7:
                System.out.print("\n\n");
                System.out.println("Enter the Subject: ");
                scan.nextLine();
                sub = scan.nextLine();
                c.prsntBySubject(sub);
                break;
            case 8:
                System.out.print("\n\n");
                System.out.println("Enter the Subject: ");
                scan.nextLine();
                sub = scan.nextLine();
                System.out.println("Enter the attendence percentage to show below: ");
                double attend = scan.nextDouble();
                c.isBelow(attend,sub);
                break;
            default:
                home_menu();
        }
    }

}

