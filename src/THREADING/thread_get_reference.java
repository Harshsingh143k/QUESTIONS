//how do you get refrence to the current thread in java??
package THREADING;
class mythread14 extends Thread {
    public void run() {
        //System.out.println("hello i am here");
        System.out.println("hello i am here and my priority is " + this.getPriority() +"...state of thread..."+ this.getState()+"...current state of thread..."+this.currentThread().getState());
        System.out.println(this.currentThread().getState());
    }
}
public class thread_get_reference {
    public static void main(String[] args) {
        mythread14 a=new mythread14();
        mythread14 b=new mythread14();
        mythread14 c=new mythread14();
        a.setPriority(Thread.NORM_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        c.setPriority(Thread.MIN_PRIORITY);

        a.start();
        b.start();
        c.start();
    }
}


