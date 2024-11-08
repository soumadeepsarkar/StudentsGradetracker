//develop a program  that allows a teacher to enter students grades and compute their average ,highest,and lowest scores.you can use ArrayList
//or arraylists to store data.

import java.util.ArrayList;
import java.util.Scanner;

public class Gradetracker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        String input;
        
        System.out.println("Enter student grades (type 'done' to finish):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try { 
                double grade = Double.parseDouble(input);
                grades.add(grade);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'done' to finish.");
            }
        }
        
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            return;
        }       
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);
        
        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        
        double average = sum / grades.size();
        
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Highest: %.2f%n", highest);
        System.out.printf("Lowest: %.2f%n", lowest);
        
        scanner.close();
    }
}
