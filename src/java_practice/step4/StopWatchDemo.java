package java_practice.step4;

import java_20190725.step2.StopWatch;

public class StopWatchDemo {
	public static void execute(StopMilliWatch sm) {
		sm.start();
		for(long i=0; i<30000000000l;i++) {
		}
		sm.stop();
	    double elapsedTime =sm.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	
	public static void execute(StopNanoWatch sn) {
		sn.start();
		for(long i=0; i<30000000000l;i++) {
		}
		sn.stop();
	    double elapsedTime =sn.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();
		execute(s1);
		
		StopNanoWatch s2 = new StopNanoWatch();
		execute(s2);
	}
}
