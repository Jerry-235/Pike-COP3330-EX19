/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);



        System.out.println("How many lbs do you weigh: ");
        double weight = input1.nextDouble();

        System.out.println("How tall are you in inches ");
        double height = input1.nextDouble();

        double BMI = (( weight / (height*height))*703);
        System.out.printf("Your BMI is: " + BMI + "\r\n");
        if (BMI > 25) {
            System.out.printf("You should see a Dr. ");

        }if (BMI < 18.5 ) {

            System.out.printf("You should see a Dr. ");
        }
        else
        {
            System.out.printf("You are healthy");




        }
    }

}
