package bank;

/**
 * 账户类
 * @author 久拥-
 *
 */
// aaa
public class Account
{
	//账户余额
	private double balance = 100;
	
	//账户名称
	private String name;
	
	public Account(String name)
	{
		super();
		this.name = name;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}
