package EXCEPTION_HANDLING;
/*
Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero.

This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .  Use exception handling mechanisms to handle this exception.

Sample Input and Output 1:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed


 Sample Input and Output 2:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException


 Sample Input and Output 3:
Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("input size of array");
        int size =s.nextInt();

        int arr[]=new int[size];
        System.out.println("input elements in array");
        try{//using try block here because ....we have to rise or create exception in input format....
        for(int i = 0; i< arr.length; i++){
            arr[i]=s.nextInt();//we are taking integer input..if we interchange it with string ..now it will gernate InputMismatchException
        }
        System.out.println("input index to print element");

        int index=s.nextInt();

            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException obj){
            System.out.println(obj.getMessage());


        }catch(NumberFormatException i  ){
            System.out.println(i);


        }catch(InputMismatchException j  ){
            System.out.println(j);
        }


    }
}
