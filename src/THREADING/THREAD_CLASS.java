package THREADING;
class MyThread extends Thread{//thread class...inherading the properties of THREAD Class
    public MyThread(String name) {//constructor...for  string
        super(name);
    }
    public void run(){//run method
        System.out.println("My Thread name is "+ this.getName());
        System.out.println("My thread Prorioty is "+this.getPriority());
    }
}//main class
public class THREAD_CLASS {
    public static void main(String[] args) {
        MyThread t1=new MyThread("Scooby");//first thread
        MyThread t2=new MyThread("Shaggy");//first thread
        t1.start();
        t2.start();

    }
}
