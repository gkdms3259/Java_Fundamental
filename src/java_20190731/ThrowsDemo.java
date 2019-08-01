package java_20190731;

public class ThrowsDemo {
    public static double getAverage(int[] temp)
    	   throws ArrayIndexOutOfBoundsException {
    	int korea = temp[0];
    	int math = temp[1];
    	int english = temp[2];
    	int history = temp[3];
    	int sum = korea + math + english + history;
    	return (double)sum / (double)4;
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] exam = {10,20,30};
		try {
			double avg = getAverage(exam);
		}catch(ArrayIndexOutOfBoundsException e) {
		  System.err.println("국어,영어,수학,국사 4개 과목을 입력해야 합니다.");
			
		}	
		}

    }


