package java_practice.step1;

public class FootNanoStopWatch {
    long startTime;
    long endTime;
    
    long startNanoTime;
    long endNanoTime;
    
    public double getElapsedTime() {
    	return(double)(endTime-startTime)/(double)1000;
    }
    public double getElapsedNanoTime() {
    	return (double)(endNanoTime - startNanoTime)/(double)1000000000;
    }
    public static void main(String[] args) {
    	FootNanoStopWatch f1 = new FootNanoStopWatch();
    	f1.startNanoTime = System.nanoTime();
    	for(long i=0;i<30000000000l;i++) {
    		
    	}
    	f1.endNanoTime = System.nanoTime();
    	
    	double elapsedTime = f1.getElapsedNanoTime();
    	System.out.printf("경과시간 : %.9f", elapsedTime);
    }
    
}

