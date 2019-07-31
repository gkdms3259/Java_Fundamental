package java_20190730;

import java.util.ArrayList;

class Product{
	int number;
	String name;
	double price;
	Product(int number, String name, double price){
		this.number = number;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
}

public class ListDemo {
	
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		ArrayList<Product> list = new ArrayList<Product>();
		
		Product p1 = new Product(1,"terra",2500);
		Product p2 = new Product(2,"신라면",1000);
		Product p3 = new Product(3,"서울우유",3000);
		Product p4 = new Product(1,"terra",2500);
		
		list.add(p1);//할당
		list.add(p2);//할당
		list.add(p3);//할당
		list.add(p4);//할당
		
		//삭제 //list.remove(0); 
		list.remove(0); //앞이나 중간부분이나 지워버리면 비워두지않고 당겨서 번호를 다시 순차적으로 부여함.
		
		//모두삭제
		//for(int i=0; i<list.size();i++) {
		//	list.remove(i--);
		//}
		
		//출력
		for(int i = 0; i<list.size();i++) {
			Product temp = list.get(i);
			System.out.println(temp);
		}
		//enhanced for loop 출력 가능(제너릭으로 선언한 경우만 가능)
		//for (Product product : list) {
		//	System.out.println(product);
		//}
		
		for(Product product : list) {
			if(product.number == 3) { //int비교는 ==연산자로 비교
				product.price = 3500;
			}
			for(int i = 0; i<list.size();i++) {
				Product temp = list.get(i);
				System.out.println(temp);
			}
		}
	}

}
