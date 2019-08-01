package java_practice.java_20190731;

public class ThrowDemo {
	public static double withdraw(String account, int amount)
	 throws IncorrectAccountException, InsufficientBalanceException {
		double myBalance = 10000;
		String myAccount = "123-12-1231234";
		if(myAccount.equals(account)) {
			if(myBalance - amount >=0) {
				myBalance -= amount;				
			}else {
				throw new InsufficientBalanceException("잔고가 부족합니다.");
			}
		}else {
			throw new IncorrectAccountException("잘못된 계정입니다.");
		}
		return myBalance;
	}
	  public static void main(String[] args) {
		  double balance = 0;
		  try {
			  balance = withdraw("123-12-1231234", 100000);
		  }catch(IncorrectAccountException e) {
			  System.out.println(e.getMessage());
		  }catch(InsufficientBalanceException e) {
			  System.out.println(e.getMessage());
		  }
	  }

}
