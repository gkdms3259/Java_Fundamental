package java_20190725.step3;

public class StopMilliWatch {
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

}
