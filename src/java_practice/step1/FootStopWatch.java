package java_practice.step1;

public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime-startTime)/(double)1000;
	}
	public static void main(String[] args) {
		FootStopWatch f1 = new FootStopWatch();
		f1.startTime = System.currentTimeMillis();
		
		for(long i=0;i<30000000000l;i++) {
			
		}
		f1.endTime = System.currentTimeMillis();
		
		double elapsedTime = f1.getElapsedTime();
	
	
	}
}
