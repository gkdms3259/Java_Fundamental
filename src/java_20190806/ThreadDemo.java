package java_20190806;

public class ThreadDemo extends Thread{
	public ThreadDemo(String threadName) {
		super(threadName);
	}
public void run() {
	for(int i=0; i<1000;i++) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s : %d%n",threadName,i);
	}
	
}

public static void main(String[] args) {
	System.out.println("***************start***************");
	//1. Thread 클래스를 상속 받는다.
	  //2. run() 메서드를  overriding한다.  run쓰고 ctrl+space
	  //3. 해당 객체를 생성한다.
	  //4. 해당 객체로 start() 메서드를 호출한다.
	//ThreadDemo t1 = new ThreadDemo("첫번째 스레드");
	new ThreadDemo("첫번째 스레드").run();    //run()으로 하면 첫번째스레드가 마친후에 두번째 스레드가 나옴.start()로 하면 스레드들이 뒤죽박죽됨
	//ThreadDemo t2 = new ThreadDemo("두번째 스레드");
	new ThreadDemo("두번째 스레드").run();  //윗줄꺼 다쓰고 t2.run()하는것보다 한번밖에 안쓰니깐 이렇게 한줄로 겹치는게 더 낫다.
	System.out.println("****************end****************");
}

}
