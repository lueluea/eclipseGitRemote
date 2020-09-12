package bank;

public class Client
{
	public static void main(String[] args)
	{
		Account account = new Account("存款");
		
		Customer bank = new Customer(account, "张三", 60);
		Customer bank1 = new Customer(account, "李四", 50);
		
		new Thread(bank).start();
		new Thread(bank1).start();

		System.out.println("克隆者添加！！");
	}
}
