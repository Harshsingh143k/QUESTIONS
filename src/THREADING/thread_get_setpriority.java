package THREADING;
class mythread1 extends Thread{
    public void run(){
        System.out.println("hello i am here and my priority is "+ this.getPriority());
    }
}
public class thread_get_setpriority {
    public static void main(String[] args) {
        mythread1 obj=new mythread1();
        mythread1 obj2=new mythread1();
        mythread1 obj3=new mythread1();
        mythread1 obj4=new mythread1();
        mythread1 obj5=new mythread1();
        mythread1 obj6=new mythread1();
        obj.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY-2);
        obj3.setPriority(Thread.MAX_PRIORITY-7);
        obj4.setPriority(Thread.MIN_PRIORITY);
        obj5.setPriority(Thread.NORM_PRIORITY);
        obj6.setPriority(Thread.NORM_PRIORITY+1);
        obj.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        obj6.start();




    }
}
