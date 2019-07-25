package java_20190725.step1;
//1.요구사항은 나노세컨드로 경과 시간을 만들어주세요.
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	 public double getElapsedTime() {     
		return (double)(endTime - startTime)/(double)1000; //자릿수 맞춰주려구~
	}                                                     //안나눠주면 소수점안나오게 구해져서ㅠ
 	 public double getElapsedNanoTime() {     
	return (double)(endNanoTime - startNanoTime)/(double)1000000000;
	}
	
	public static void main(String[] args) {
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		//currentTimeMillis() => 1970.01.01부터 지금까지 시간을 밀리세컨드로 반환한다.
		//f1.startTime = System.currentTimeMillis();
		f1.startNanoTime = System.nanoTime();
		for(long i=0; i<30000000000l;i++) {

		}
		//f1.startTime = System.currentTimeMillis();
		f1.endNanoTime = System.nanoTime();
	    
	    double elapsedTime =f1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
		//long elapsedTime =f1.endTime - f1.startTime;
		//System.out.printf("경과시간 : %d", elapsedTime);
	}
}
