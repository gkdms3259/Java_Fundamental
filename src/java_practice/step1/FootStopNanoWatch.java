package java_practice.step1;

public class FootStopNanoWatch {
    long startTime;
    long endTime;
    
    long startNanoTime;
    long endNanoTime;
    
    public double getElapsedTime() {
    	return(double)(endTime-startTime)/(double)1000;
    }
}
