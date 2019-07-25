package java_practice.step5;

public class StopWatchDemo {
	public static void execute(StopWatch sw) {
		sw.execute();
	}
	
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();
		execute(s1);
		
		StopNanoWatch s2 = new StopNanoWatch();
		execute(s2);
		
		StopMicroWatch s3 = new StopMicroWatch();
		execute(s3);
	}
}
