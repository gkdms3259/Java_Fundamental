package java_20190725.step2;

import java_20190725.step1.FootNanoStopWatch;

public class StopWatchDemo {
	
	//Nano
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		s1.startNano();
		for(long i=0; i<30000000000l;i++) {

		}
		s1.stopNano();

	    
	    double elapsedTime =s1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
		
	}   //millis
		/*StopWatch s = new StopWatch();
		s1.start();
		for(long i=0; i<30000000000l;i++) {

		}
		s1.stop();

	    
	    double elapsedTime =s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
		*/

}
