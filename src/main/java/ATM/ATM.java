package ATM;

/*** 3.  Write an app that simulates an ATM machine.
		Requirements:
		the app should run indefinitely, allowing customers to enter their cards and withdraw money, deposit money, interogate sold and change pin.
class design (just a recomandation):
		- User has one or more BankAccounts
		- User has one or more Cards
		- Cards are emitted to a single BankAccount
		- User interacts with Cards via a withdraw(Card), deposit(Card), changePin(Card) or interogateBalance(Card) action from ATM class based on the option he inputs to the keyboard.*/

public class ATM {
	public static void main(String[] args) {
		Account a = new Account();
		a.age= 34;
		a.name = "Bogdan";
		/**System.out.println(a.age);
		 System.out.println(a.name);*/

		a.printDetails();

		bankAccount deposit = new bankAccount();

	}
}
class Account{
	String name; int age;

	public void printDetails(){
		System.out.println(name + ", " + age);
	}
}
class bankAccount{
	private double balance = 0;
	public void deposit (double x){
		if(x >= 0.0){
			balance += x;
		}
		return balance;
	}
}