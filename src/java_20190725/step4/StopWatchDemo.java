package java_20190725.step4;

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
		StopNanoWatch s1 = new StopNanoWatch();
		execute(s1);
		
		StopMilliWatch s2 = new StopMilliWatch();
		execute(s2);
		
	}
	}