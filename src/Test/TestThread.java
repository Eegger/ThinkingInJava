package Test;

/*
 * 运行多次后发现，优先级高的一般会最先执行完循环，而最低优先级的一般会最后执行完循环。
 * 
 * 因为Java的线程是被映射到系统的原线程上来实现的，所以线程调度最终还是由操作系统说了算的，
 * 虽然很多线程都提供线程优先级的概念，但是并不剪得能与java线程的优先级一一对应，
 * 如Solaries中有231种优先级，Windows中就只有7中，并不一定能与java线程的优先级设置一一对应，
 * 因此，建议还是直接使用java本身自带的三个MIN_PRIORITY（1）、NORM_PRIORITY（5）、MAX_PRIORITY（10）
 * 来设置优先级比较好
 */
public class TestThread extends Thread {

	public void run() { 
		
        Thread currentThread = Thread.currentThread();  
        //输出当前线程的名字、优先等级  
        for (int i = 0; i < 50; i++) {  
            System.out.println("name : " + currentThread.getName()  
                    + "\t priopity : " + currentThread.getPriority() + " " + i);  
        }  
    }  
      
    public static void main(String[] args) {  
        
    	//创建优先级为5一个线程对象  
        TestThread ttNorm = new TestThread();  
        ttNorm.setPriority(NORM_PRIORITY);  
        ttNorm.start();  
          
        //创建优先级为1一个线程对象  
        TestThread ttMin = new TestThread();  
        ttMin.setPriority(MIN_PRIORITY);  
        ttMin.start();  
          
        //创建优先级为10一个线程对象  
        TestThread ttMax = new TestThread();  
        ttMax.setPriority(MAX_PRIORITY);  
        ttMax.start();          
    }  
}
