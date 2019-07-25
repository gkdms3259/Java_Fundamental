package java_20190725.step5;

public class StopMicroWatch extends StopWatch {
	
	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		endTime = System.nanoTime();
	}
	 public double getElapsedTime() {     
		return (double)(endTime - startTime)/(double)1000000000;
	}
	 public void execute() {
			start();                              
			for(long i=0; i<30000000000l;i++) {

			}
			stop();
		    
		    double elapsedTime =getElapsedTime();
			System.out.printf("경과시간 : %.6f", elapsedTime);
		}

}
