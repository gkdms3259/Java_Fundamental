package java_20190729;

import java.util.HashSet;

class Car{
	String modelNumber;
	String color;
	public Car(String modeNumber, String color) {
		this.modelNumber = modelNumber;
		this.color = color;
	}
	@Override
	public int hashCode() {    //shift + alt + s + h => hashCode,equals overriding 해주는 것
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		return result;
	}
	//toString() 메서드를 overriding
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}
}
public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1==s2);        //연산자는 overriding을 하지 못한다.
		System.out.println(s1.equals(s2)); //equals는 overriding을 할 수 있다.
		System.out.println(s1.hashCode()); //equals를 overriding을 하면 hashCode도 overriding을 해줘야한다.
		System.out.println(s2.hashCode()); //같은 객체인 것처럼 overriding을 해줘야한다.
		Car c1 = new Car("10101010","black");
		Car c2 = new Car("10101010","black");
		
		//==연산자는 c1과 c2가 같은 객체를 참조하면 true, 그렇지 않으면 false
		System.out.println(c1==c2); 
		//equals -> c1과 c2가 같은 객체를 참조하면 true, 그렇지 않으면 false
		System.out.println(c1.equals(c2)); 
		
		//해쉬코드란 객체가 가지는 유일한 값. 반드시 유일한 값을 가져야 함.
		int hashCode1 = c1.hashCode();
		int hashCode2 = c2.hashCode();
		System.out.println(hashCode1);
		System.out.println(hashCode2);
		
		Car c3 = new Car("101010", "White");
		Car c4 = c3;
		
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		//c3.equals(c4)의 결과가 true이면 c3, c4의 hashCode값은 같고
		//c3.equals(c4)의 결과가 false이면 c3, c4의 hashCode값은 달라야 한다.
		int hashCode3 = c3.hashCode();
		int hashCode4 = c4.hashCode();
		System.out.println(hashCode3);
		System.out.println(hashCode4);
		
		System.out.println(c3.toString());
		
		HashSet<Car> set = new HashSet<Car>(); 
		set.add(c1);
		set.add(c2);
		System.out.println(set.size());  //hashCode overriding한거 지우면 다른 객체로 인식하고 2개가나옴
	                                     //안지우면 같은 객체라고 인식해서 1개가 나온다.
	
	}                                    

}
