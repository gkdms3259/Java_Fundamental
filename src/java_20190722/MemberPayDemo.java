package java_20190722;

public class MemberPayDemo {
   public static void main(String[] args) {
	MemberPay m1 = new MemberPay();
	m1.setSeq(1);
	m1.setGroup(1);
	m1.setName("MBE");
	m1.setPrice(580);
	m1.setStatus("1");
	m1.setSdate("2019-07-22");
	m1.setEdate("2020-01-22");
	m1.setRegdate("2019-07-22");
	m1.setValid(true);
   
	System.out.println(m1.getSeq());
	System.out.println(m1.getGroup());
	System.out.println(m1.getName());
	System.out.println(m1.getPrice());
	System.out.println(m1.getStatus());
	System.out.println(m1.getSdate());
	System.out.println(m1.getEdate());
	System.out.println(m1.isValid());
	System.out.println(m1.getRegdate());
	
	
   } 
}
