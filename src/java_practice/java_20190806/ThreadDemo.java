package java_practice.java_20190806;

public class ThreadDemo extends Thread{
	public ThreadDemo(String threadName) {
	super(threadName);
}	
@Override
public void run() {
     for(int i=0;i<1000;i++) {
    	 String threadName = Thread.currentThread().getName();
    	 System.out.printf("%s : %d%n",threadName,i);
     }

}
public static void main(String[] args) {
	System.out.println("*************start*************");
	new ThreadDemo("첫번째 스레드").run();
	new ThreadDemo("두번째 스레드").run();
	System.out.println("*************end*************");
}
}