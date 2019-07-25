package java_practice.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
	StopWatch s1 = new StopWatch();
	s1.startNano();
	for(int i=0; i<30000000000l;i++) {
		
	}
	s1.stopNano();
	
	double elapsedTime = s1.getElapsedNanoTime();
	System.out.printf("경과시간 : %.9f", elapsedTime);
	

}
}