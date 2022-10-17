/*
 * D evelop application for banking application. Create a class named “BankDetails” with the data
 * members as customerName, accountNo, accountType, Balance. Member functions are read(),
 * display(), deposit(),withdraw(), search(). Get the details of ‘n’ customers and write the menu driven
 * program to perform the functions.
 */
// Real, Personal and Nominal Account
import java.util.*;
public class BankSoftware{
	private String customerName, accountType;
	private int accountNo, Balance;
	void getdata(String CN, int AN, String AT, int BL){
		customerName = CN;
		accountNo = AN;
		accountType = AT;
		Balance = BL;
	}
	void display(){
		System.out.println("Username : " + customerName);
		System.out.println("Account No : " + accountNo);
		System.out.println("Account Type : " + accountType);
		System.out.println("Balance : " + Balance);
	}
	static int search(BankSoftware[] users,int ACNO, int len){
		int i;
		for(i=0; i<len; i++){
			if(ACNO == users[i].accountNo){
				return i;
			}
		}
		return -1;
	}
	void deposit(int amount){
		Balance += amount;
	}
	void withdraw(int amount){
		Balance -= amount;
	}
	public static void main(String[] argc){
		Scanner sc = new Scanner(System.in);
		BankSoftware[] user = new BankSoftware[20];
		int i=0,len=0,option=0,temp=0,Ano,money;
		String na,type;
		System.out.println("\t\tMENU BAR\n1.add user\n2.Display User detiles(AccountNO)\n3.Deposit a amount\n4.Withdraw a amount \n");
		while(true){
			System.out.print("\nEnter Your Option : ");
			option = sc.nextInt();
			switch(option){
				case 1:
					System.out.print("Enter the number of users : ");
					len = sc.nextInt();
					for(i=0; i<len; i++){
						user[i] = new BankSoftware();
						System.out.print("Enter Your Name : ");
						na = sc.next();
						System.out.print("Enter Your Account No : ");
						Ano = sc.nextInt();
						System.out.print("Enter Your Type : ");
						type = sc.next();
						System.out.print("Enter Your Amount : ");
						money = sc.nextInt();
						user[i].getdata(na, Ano, type, money);
						System.out.println("User Added Successfully :)");
					}
					break;
				case 2:
					System.out.print("Enter the Account NO : ");
					temp = sc.nextInt();
					temp = search(user,temp,len);
					user[temp].display();
					break;
				case 3:
					System.out.print("Enter the Account NO : ");
					temp = sc.nextInt();
					temp = search(user,temp,len);
					System.out.print("Enter the Amount : ");
					Ano = sc.nextInt();
					user[temp].deposit(Ano);
					break;
				case 4:
					System.out.print("Enter the Account NO : ");
					temp = sc.nextInt();
					temp = search(user,temp,len);
					System.out.print("Enter the Amount : ");
					Ano = sc.nextInt();
					user[temp].withdraw(Ano);
					break;
				default:
					System.out.print("\n\nInvalid Option....\n\n");

			}
		}
	}
}
