//Created by Jenain Khan
//Converts one unit of temperature into the two other options with all three options being Celsius.Kelvin, and Fahrenheit.

import java.util.Scanner;
import java.util.*;

public class main {
    static Scanner scan = new Scanner(System.in);

    //Methods to convert the different units.

    //Convert Celsius
    static double CtoK (double num){
       double K = num + 273.15;
       System.out.println("Kelvin value: " + K);
       return 0;
    }
    static double CtoF (double num){
        double F = (num * 9/ (5)) + 32;
        System.out.println("Fahrenheit value: " + F);
        return 0;
    }

    //Convert Fahrenheit
    static double FtoK (double num){
        double K = ((num-32) * (5)) /9 + 273.15;
        System.out.println("Kelvin value: " + K);
        return 0;
    }
    static double FtoC (double num){
        double C = (((num-32) * 5)/9);
        System.out.println("Celsius value: " + C);
        return 0;
    }

    //Convert Kelvin
    static double KtoC (double num){
        double C = num - 273.15;
        System.out.println("Celsius value: " + C);
        return 0;
    }
    static double KtoF (double num){
        double F=((num-273.15) * (9))/5 + 32;
        System.out.println("Fahrenheit value: " + F);
        return 0;
    }


    public static void main(String args[]){

            System.out.println("Please enter the units (Celsius, Fahrenheit, Kelvin) of the temperature you would like to convert:");
            String units = scan.nextLine();
            System.out.println("Enter the "+units+" value to be converted:");
            double num = scan.nextDouble();

            if(units.equals("Celsius")){
                CtoK( num );
                CtoF( num );
            }

            if(units.equals("Fahrenheit")){
                FtoC(num);
                FtoK(num);
            }
            if(units.equals("Kelvin")) {
                KtoC(num);
                KtoF(num);
            }

            if(!(units.equals("Fahrenheit")) && !(units.equals("Celsius")) && !(units.equals("Kelvin"))){
                System.out.println("Error! Please choose a viable unit (Celsius, Fahrenheit,Kelvin).");
            }

        try {
            num = Integer.parseInt("100"); // Parse string into number
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        }
    }



