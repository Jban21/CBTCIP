import java.util.*;
class ATM
{
	int acc_no;
	double acc_balance;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number:");
		acc_no=sc.nextInt();
		System.out.println("Enter the account balance:");
		acc_balance=sc.nextDouble();
	}
	void withdraw(double amount)
	{
		if(amount>0 && (acc_balance-amount)>=1000)
		{
			System.out.println("Successfully withdrawn required amount="+amount);
			acc_balance=acc_balance-amount;
		}
		else
			System.out.println("withdrawn failed or insufficient account balance to withdraw");
	}
	void deposit(double amount)
	{
		if(amount>0)
		{
			System.out.println("Successfully deposited "+amount+" amount");
			acc_balance+=amount;
		}
		else
			System.out.println("Invalid deposit amount");
	}
	void checkbalance()
	{
		System.out.println("The balance is of account number "+acc_no+" is "+acc_balance);
	}
}
class Bank extends ATM
{
	double amount,transaction_amnt;
	void display()
	{
		checkbalance();
	}
	void transaction()
	{
		System.out.println("How much money you want to tranfer:");
		Scanner sc=new Scanner(System.in);
		transaction_amnt=sc.nextDouble();
		if(transaction_amnt<=super.acc_balance)
		{
			System.out.println("Transaction possible!!");
			super.acc_balance-=transaction_amnt;
			System.out.println("After transaction remaining amount available:"+super.acc_balance);
		}
		else
			System.out.println("Your desired transaction amount is beyond of the account balance!SORRY!!");
	}
}
class Money
{
	public static void main(String args[])
	{
		Bank bn=new Bank();
		bn.input();
		bn.withdraw(10000);
		bn.deposit(6000);
		bn.display();
		bn.transaction();
	}
}
	