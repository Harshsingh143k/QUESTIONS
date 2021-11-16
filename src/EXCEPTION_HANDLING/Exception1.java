package EXCEPTION_HANDLING;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("input size of array");
        int size =s.nextInt();
        int arr[]=new int[size];
        System.out.println("input elements in array");
        for(int i = 0; i< arr.length; i++){
            arr[i]=s.nextInt();
        }
        System.out.println("input index to print element");
        int index=s.nextInt();
        try{
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException obj){
            System.out.println(obj.getMessage());
        }

    }
}
