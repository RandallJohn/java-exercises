package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean inputIsValid = false;    /* instantiates a control variable arguement that is a boolean expression. */
        do {
            System.out.println("Enter a radius: ");
            double radius = in.nextDouble();
            inputIsValid = radius > 0;   /* says if True ; changes control boolean expression variable to true thus stopping the infintiy loop */

            if (inputIsValid) {          /* statement that if controll variable is true do the following */
                double area = (radius * 2) + 3.14;
                System.out.println("The area of a circle with a radius of " + radius + " is: " + area +".");
            } else {                      /* else if control variable is not true, repeat the system prompt below to user */
                System.out.println(" Radius needs to be a whole number.");
            }
        } while (!inputIsValid);

    }
}

        /*
        USING IF ELSE STATEMENTS:

        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();

        if(radius > 0) {
            double area = (radius * 2) + 3.14;
            System.out.println("The area of a circle with a radius of " +radius + "is: " );
        } else {
            System.out.println(" Radius needs to be a whole number." );
        }


/*
        do {
            System.out.println("Enter a radius ");
            double radius = in.nextDouble();

            } while (radius <= 0);

        if (radius > 0) {
            Double area = radius * radius * 3.14;
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
    }
}
*/



