import java.util.Scanner;

public class expection3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("enter size");
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        } for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int avg=sum/n;


        System.out.println(avg);

        System.out.println(sum/0);


    }
}
