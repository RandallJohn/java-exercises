package exercises;

import java.util.Scanner;

public class mphConverter {

        public static void main(String[]args) {


            Scanner in = new Scanner(System.in);

            System.out.println("What is the number of miles you have driven?");
            double miles = in.nextDouble();

            System.out.println("Okay after driving " + miles +" miles, how many gallons of gas did you use ?");
            double gas = in.nextDouble();


            double mph = miles / gas;
            System.out.println("Great, for driving " + miles + " miles while consuming " + gas + " gallons of gas,  your averaging " + mph + " miles-per-gallon (MPG).");


        }
}

