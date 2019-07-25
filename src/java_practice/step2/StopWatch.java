package java_practice.step2;

public class StopWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
	}
	
	
	long startNanoTime;
	long endNanoTime;
	
	public void startNano() {
		startTime = System.nanoTime();
	}
	public void stopNano() {
		endTime = System.nanoTime();
	}
	public double getElapsedNanoTime() {
		return (double)(endTime - startTime)/(double)1000000000;
	}

}
