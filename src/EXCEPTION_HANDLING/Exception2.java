/*
Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
 */

package EXCEPTION_HANDLING;

public class Exception2 {
    public static void main(String[] args) {
        int n=100;
        String s="j";


        try{
            int num= Integer.parseInt(s);
            System.out.println(n+num);
        }catch(NumberFormatException i){
            System.out.println(i);
        }

    }
}
