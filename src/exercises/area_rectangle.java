package exercises;
import java.util.Scanner;

public class area_rectangle {
    public static void main(String[]args) {




        Scanner in = new Scanner(System.in);

        System.out.println("What is the Width of your rectangle in inches ?");
        int width = in.nextInt();

        System.out.println("Okay your width is " + width +" inches, what is the height in inches ?");
        int height = in.nextInt();


        int area = width * height;
        System.out.println("Great, for your rectangle that is, " + width + " inches wide, and has a height of " + height + " inches,  the area is " + area + " inches.");


    }
}
