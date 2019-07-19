package java_20190719;

public class TwoArrayDemo {
	public static void main(String[] args) {
		int[][] a = new int[3][2];
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		int[][] b = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
	    	for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
                System.out.println();
	    	}

	    	
	    int[] c = {10,20,30};
	    //enhanced for loop - 배열변수명을 넣어주면 하나도 빼놓음없이 다 결과출력(배열에서만 가능)
	    for(int temp : c) {
	    	System.out.println(temp);
	    }
	    	
	}
}
