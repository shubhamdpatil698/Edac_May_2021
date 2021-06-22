import java.util.Scanner;

/*4.Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number
for each depositorFor first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of
depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final information of that
depositor4 - Remove some amount from the account of any depositor and then display final information of that
depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total
number of transactions.
*/

class BankAccount
{
	String AccountName;
	String AccountAddress;
	String AccountType;
	static float Balance;
	static int tempan = 1000;
	static String SAN="BA";
	String AccountNumber;
	static int Trans;
	static int a=0;
	
	static Scanner sc =new Scanner(System.in);
	BankAccount AccountData[] = new BankAccount[10];
	
	BankAccount(){}
    BankAccount(String name,String address,String type,float balance)
    {
    	this.AccountName=name;
    	this.AccountAddress=address;
    	this.AccountType=type;
    	this.Balance=balance;
    }
	public BankAccount AddData()
	{
		String temp=Integer.toString(tempan);
		AccountNumber=SAN+temp;
		
		System.out.println("Enter the Account holder name : "+"\t");
		AccountName=sc.nextLine();
		
		System.out.println("Enter the Account holder address : "+"\t");
		AccountAddress=sc.nextLine();
		
		System.out.println("Enter Account type : "+"\t");
		AccountType=sc.nextLine();
		
		System.out.println("Enter initial security amount : "+"\t");
		Balance=sc.nextFloat();
		
		return new BankAccount(AccountName,AccountAddress,AccountType,Balance);
	}
	//
	BankAccount [] SaveData()
	{
		for (int i=a; i<AccountData.length;i++)
		{
			AccountData[i]=AddData();
			a++;
			break;
		}
		return AccountData;
	}
	
	void Display(BankAccount [] Desp)
	{
		System.out.println("Enter your Account number :"+"\t");
		String accno = sc.next();
		for (int i=0; i<Desp.length;i++)
		{
			if(accno.equals(Desp[i].AccountNumber))
			{
				System.out.println(String.format("Account Name\t%s \nAccount holder Address\t%s\nAccount Type\t%s\nTotal Balance\t%f",Desp[i].AccountName,Desp[i].AccountAddress,Desp[i].AccountType,Desp[i].Balance));
				break;
			}
		}
	}
	
	
	
	
	
}








public class AssQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
