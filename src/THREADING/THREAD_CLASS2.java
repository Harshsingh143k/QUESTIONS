// ques..write a program to print "good morning" and "welcome continiously on the screen in java using thread"
package THREADING;
import com.sun.jdi.PathSearchingVirtualMachine;
class mythread01 extends Thread{//class 1
    public void run(){//method 1
        while(true){
            System.out.println("GOOD MORNING");
        }

    }
}
class mythread02 extends Thread{//class 2
    public void run(){//method 2
       while(true){
           System.out.println("WELCOME");
       }
    }
}
public class THREAD_CLASS2 { // main class
    public static void main(String[] args) {
        mythread01 a=new mythread01();// creating object of class 1
        mythread02 b=new mythread02();// creating object of class 2
        a.start();
        b.start();

    }

}
