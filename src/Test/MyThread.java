package Test;

/*
 * 第一种方法，直接继承thread类，重写父类的run方法
 * 
 * 可以看出：一系列线程以某种顺序启动并不意味着将按该顺序执行。
 * 对于任何一组启动的线程来说，调度程序不能保证其执行次序，持续时间也无法保证。
 * 会先运行main线程
 */
public class MyThread extends Thread {  
    //重写父类的run()方法  
    public void run() {  
        this.setName("run Thread");  
        for (int i = 0; i < 7; i++) {  
            System.out.println(this + " " + i);  
        }  
    }  
    public static void main(String[] args) {  
        //注意，线程开始执行的方法是start()而不是run()方法  
        new MyThread().start();      
        for (int i = 0; i < 5; i++) {  
            System.out.println("Main Thread : " + i);  
        }  
    }  
  
}  