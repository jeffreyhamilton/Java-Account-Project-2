

public class CheckingFromAccount extends Account {

	private double overdraft = 100;

	
	public CheckingFromAccount()
	{
	
	}
	

	public double getOverdraft() 
	{
		return overdraft;
	}

	public void setOverdraft(double overdraft) 
	{
		this.overdraft = overdraft;
	}
	
	
	public boolean isOverdraft()
	{
		double isOver = balance + overdraft;
		if(isOver >= 0){return false;}
		else{return true;}
		
	}

	@Override
	public String toString()
	{
		return "Your Checking account has an overdraft limit of " + overdraft + " Is it overdrawn: " + isOverdraft();
	}

}
	

