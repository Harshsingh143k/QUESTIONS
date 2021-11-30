package THREADING;

// q1..write a program to print "good morning" and "welcome continiously on the screen in java using thread"
//question2.. add a step in question  to deley its execution for 200ms
class mythread11 extends Thread{//class 1
    public void run(){//method 1
        while(true){
            System.out.println("GOOD MORNING");
        }

    }
}
class mythread12 extends Thread{//class 2
    public void run(){//method 2

        while(true){
            try {
                Thread.sleep(100);//using sleep method for making delay in program execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WELCOME");
        }
    }
}public class thread_class3{ // main class
    public static void main(String[] args) {
        mythread11 a=new mythread11();// creating object of class 1
        mythread12 b=new mythread12();// creating object of class 2
        a.start();
        b.start();

    }

}
