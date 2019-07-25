package java_20190725.step3;

import java_20190725.step2.StopWatch;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();//Nano로 바꾸고 싶으면  
		s1.start();                              //Milli를 Nano로 바꾸고 밑에 숫자를 9로 바꿔준다.
		for(long i=0; i<30000000000l;i++) {

		}
		s1.stop();
	    
	    double elapsedTime =s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
