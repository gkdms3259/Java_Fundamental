package java_20190806;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	
	@Override
	public void run() {  //sychronized를 안쓰면 뒤죽박죽, 쓰면 한번 제어권을 잡으면 순서를 뺏기지않기때문에 차례대로 진행이됨.
		// TODO Auto-generated method stub
		synchronized(SynchronizedDemo.class) { //아니면 이렇게 처리를 해주면 제어권을 뺏기지 않음. synchronized(this){로 써도 괜춘~
		for(int i=0;i<100;i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d, y : %d - %s%n",x,y,threadName);
		}
		}
		}
		public static void main(String[] args) {
			SynchronizedDemo s1 = new SynchronizedDemo();
			SynchronizedDemo s2 = new SynchronizedDemo();
			
			Thread t1 = new Thread(s1);
			//Thread t2 = new Thread(s1); 
		    Thread t3 = new Thread(s2);  //이렇게 같은것을 참조하는것이 아니면 임계영역이 없기때문에 제어권을 다투면서 나온다.
			
		    t1.start();
		    //t2.start();
		    t3.start();
	}

}
