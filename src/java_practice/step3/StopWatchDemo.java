package java_practice.step3;

import java_20190725.step2.StopWatch;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();
		s1.start();
		for(long i=0; i<30000000000l;i++) {
		}
		s1.stop();
	    double elapsedTime =s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
