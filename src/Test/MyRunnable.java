package Test;

class MThread implements Runnable {
	
	 public void run() {  
	        //获取当前线程并且设置线程的名字  
	        Thread.currentThread().setName(("The other Thread"));      
	        for (int i = 0; i <10; i++) {  
	            System.out.println(Thread.currentThread() + " " + i);  
	        }  
	    }  
	}  
public class MyRunnable {  
	    public static void main(String[] args) {  
	        //注意将创建自定义的线程类对象并传进Thread类的构造方法中      
	        new Thread(new MThread()).start();  
	        for (int i = 0; i < 10; i++) {  
	            System.out.println("Main Thread : " + i);  
	        }           
	    }
}
