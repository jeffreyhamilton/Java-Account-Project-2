import java.text.NumberFormat;

public class Project11_3 {

	public static void main(String[] args)
	{

		Account Account = new Account(1122, 20000);
		CheckingFromAccount Checking = new CheckingFromAccount();
		SavingFromAccount Saving = new SavingFromAccount();
		
		//set annual interest rate as well as withdraw and deposit amounts
		Account.setAnnualInterestRate(4.5);
		Account.deposit(300);
		Account.withdraw(20101);
		
		Checking.setAnnualInterestRate(4.5);
		Checking.deposit(0);
		Checking.withdraw(20);
		
		//Display balance, monthly interest and account creation date.
		System.out.println("Your current blance is: " + 
				NumberFormat.getCurrencyInstance().format(Account.getBalance()));
		System.out.println("Your monthly interest was: " + NumberFormat.getCurrencyInstance().format(Account.getMonthlyInterest()));
		System.out.println("Account created on: " +
				Account.getDateCreated());
		System.out.println(Checking.toString());
		System.out.println(Saving.toString());
		
		
	}
}
