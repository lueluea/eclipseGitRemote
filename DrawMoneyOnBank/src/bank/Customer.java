package bank;

/**
 * 客户类 模拟取钱操作
 * 
 * @author 久拥-
 *
 */
public class Customer implements Runnable
{
	// 取钱的账户
	private Account account = null;
	// 取钱数额
	private double money;
	// 取钱的人
	private String name;

	public Customer(Account account, String name, double money)
	{
		super();
		this.account = account;
		this.name = name;
		this.money = money;
	}

	@Override
	public void run()
	{
		drawMoney(money);
	}

	private void drawMoney(double money)
	{

		if (account.getBalance() <= 0)
		{
			System.out.println(this.name + "取钱，余额不足！！");
			return;
		}

		// 模拟网络延迟
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		// 锁住Account对象
		synchronized (account)
		{
			if (account.getBalance() <= 0)
			{
				System.out.println(this.name + "取钱，余额不足！！");
				return;
			}

			if (account.getBalance() - money < 0)
			{
				System.out.println(this.name + "取钱，余额不足！！");
				return;
			} 
			else
			{
				account.setBalance(account.getBalance() - money);
				System.out.println(this.name + "取出金额 -->" + money);
				System.out.println("余额 -->" + account.getBalance());
			}
		}

	}
}
