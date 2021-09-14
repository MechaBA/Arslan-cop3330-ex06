/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.*;
public class App {
    public static void main(String[] args) {
        int currentAge;
        int retirementAge;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your current age? ");
        currentAge = sc.nextInt();
        System.out.print("At what age would you like to retire? ");
        retirementAge = sc.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearsLeft = retirementAge-currentAge;
        if(yearsLeft >= 0)
        {
            int retirementYear = year + yearsLeft;
            System.out.println("You have "+yearsLeft +" years left until you can retire.");
            System.out.println("It's " +year+ ", so you can retire in " +retirementYear+ ".");
        }
        else
        {
            System.out.println("You can already retire");
        }
    }
}