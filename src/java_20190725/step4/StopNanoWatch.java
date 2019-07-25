package java_20190725.step4;

public class StopNanoWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		endTime = System.nanoTime();
	}
	 public double getElapsedTime() {     
		return (double)(endTime - startTime)/(double)1000000000;
	}

}
