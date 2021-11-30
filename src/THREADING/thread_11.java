package THREADING;
// how do you get state of a given thread in java
class mythread13 extends Thread{
    public void run(){
        System.out.println("hello i am here");
        System.out.println("hello i am here and my priority is "+ this.getPriority() +this.getState());
    }
}
public class thread_11 {
    public static void main(String[] args) {
        mythread13 a=new mythread13();
        mythread13 b=new mythread13();
        mythread13 c=new mythread13();
        a.setPriority(Thread.NORM_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        c.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
        c.start();
    }
}
