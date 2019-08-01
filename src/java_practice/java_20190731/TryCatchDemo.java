package java_practice.java_20190731;

public class TryCatchDemo {
	public static double getAvg(int korean, int english) {
		int sum = korean + english;
		double avg = (double)sum/(double)2;
		return avg;
	}
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			double average = getAvg(korean,english);
			System.out.printf("평균 : %f%n", average);
		}catch(NumberFormatException e1) {
			System.out.println("문자말고 숫자 넣어");
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("2개넣어");
	}finally {
		System.out.println("finally");
	}
	}

}
