import java.util.Date;

public class Account {
	
	//data fields
	private int id = 0;
	protected double balance = 0, annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//nor-arg constructor for default account
	Account()
	{
	
	}
	//constructor for account w/ id and balance specified
	Account(int newId, double newBalance)
	{
		this.id = newId;
		this.balance = newBalance;
	}
	//accessor and mutator methods for id, balance and annualInterestRate
	public void setId(int I) 
	{
		this.id = I;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setBalance(double b)
	{
		this.balance = b;
	}
	
	public double getBalance()
	{
	return balance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate)
	{
		this.annualInterestRate = newAnnualInterestRate / 100;
	}
	
	public double getAnnualInterestRate()
	{
	return annualInterestRate;	
	}
	//accessor method for dateCreated
	public Date getDateCreated()
	{
		return dateCreated;
	}
	//method for monthlyInterestRate
	public double getMonthlyInterestRate()
	{
		
		return annualInterestRate / 12;
		 
	}
	//method for the monthlyInterestRate
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate / 12);
	}
	//method for withdraw
	public double withdraw(double w)
	{
		
		return balance = balance - w;
		
	}
	//method for deposit
	public double deposit(double d)
	{
		return balance = balance + d;
	}
	
	public String toString()
	{
		return "This is an account";
	}
	
	
}

