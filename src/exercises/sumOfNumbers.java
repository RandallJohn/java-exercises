package exercises;

public class sumOfNumbers {


    public static void main(String[] args) {
        int [] someInts = {2,3,4,5,6,7,8,9,10,11};

        System.out.println("Sum of Even numbers is " + countE(someInts));
    }

    public static int countE(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {   /*validation that the arraylist is not empty */
            return 0;
        } else {
            for (int i : arr) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}



