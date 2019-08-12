package java_20190809;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

class A extends Thread{
	public void run() {
		System.out.println("스레드1..");
	}
	
}

class B implements Runnable{
	public void run() {
		System.out.println("스레드2..");
		
	}
}
class Customer{
	String name;
	Customer(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
}
class CustomerDao{
	public Customer[] getCustomer() {
		Customer[] cs = new Customer[10];
		Customer c1 = new Customer("성영한1");
		Customer c2 = new Customer("성영한2");
		Customer c3 = new Customer("성영한3");
		Customer c4 = new Customer("성영한4");
		Customer c5 = new Customer("성영한5");
		Customer c6 = new Customer("성영한6");
		Customer c7 = new Customer("성영한7");
		Customer c8 = new Customer("성영한8");
		Customer c9 = new Customer("성영한9");
		Customer c10 = new Customer("성영한10");
		cs[0] = new Customer("성영한1");
		cs[1] = new Customer("성영한2");
		cs[2] = new Customer("성영한3");
		cs[3] = new Customer("성영한4");
		cs[4] = new Customer("성영한5");
		cs[5] = new Customer("성영한6");
		cs[6] = new Customer("성영한7");
		cs[7] = new Customer("성영한8");
		cs[8] = new Customer("성영한9");
	    cs[9] = new Customer("성영한10");
		return cs;
	}
	
	public ArrayList<Customer> getCustomers(){
		ArrayList<Customer> list = new ArrayList<Customer>();  //ArrayList는 하나 빠져도 괜춘 , but Array경우는 하나라도 빠지면 에러나기때문에
		list.add(new Customer("성영한1"));                       //ArrayList가 더 좋다.
		list.add(new Customer("성영한2"));
		list.add(new Customer("성영한3"));
		list.add(new Customer("성영한4"));
		list.add(new Customer("성영한5"));
		list.add(new Customer("성영한6"));
		list.add(new Customer("성영한7"));
		list.add(new Customer("성영한8"));
		list.add(new Customer("성영한9"));
	    list.add(new Customer("성영한10"));
		return list;
	}
	
	public ArrayList<Customer> getCustomer();
	
}


public class GarbageDemo {
	public static void main(String[] args) throws IOException{
		//Dao(data Access Object)
		CustomerDao cdao = new CustomerDao();
		
		Customer[] customers = cdao.getCustomer();
		for (Customer customer : customers) {
	      System.out.println(customer.getName());
	      
		}
		ArrayList<Customer> list =cdao.getCustomers();
		for (Customer customer : list) {
			System.out.println(customer.getName());
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*A a = new A();
		a.start();
		
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();
	
		System.out.println("aaaaa");
		*/
	/*	
		//Calendar c = new Calendar(); //객체로 생성할 수 없다.=> 추상클래스거나 인스턴스라는 뜻인데 캘린더는 추상클래스이다.
		Calendar c = Calendar.getInstance();
		Calendar c1 = new GregorianCalendar(); //위에것과 동일함.
		} */
	
	/*
        FileWriter fw = new FileWriter("c:\\dev\\test\\aa.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter("c:\\dev\\test\\aa.txt");
        PrintWriter pw1 = new PrintWriter(bw,true);
      */ 
     /*   int d = Integer.parseInt("10");  //int d= "10" , String e = d+ "10"; 이렇게 하지말고 저렇게 하기.
        String e = String.valueOf(d);  */
        
        
      
/*  	//Calendar 클래스의 메서드만 사용할 수 있음. 
        //단, GregorianCalendar 클래스에서 overriding된 메서드는 사용가능.
        //GregorianCalendar기능을  Calendar가 쓰게 하려고 한것. 
		public static Calendar getInstance() {      //위와 동일
  			Calendar c = new GregorianCalendar();   
			return c;
		}
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


