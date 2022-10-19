/*
 * Develop a Java application to generate Electricity bill. Create a class with the following
members: Consumer no., consumer name, previous month reading, current month
reading, type of EB connection (i.e domestic or commercial). Compute the bill amount
using the following tariff.
If the type of the EB connection is domestic, calculate the amount to be paid as
follows:
• First 100 units - Rs. 1 per unit
• 101-200 units - Rs. 2.50 per unit
• 201 -500 units - Rs. 4 per unit
• 501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as
follows:
• First 100 units - Rs. 2 per unit
• 101-200 units - Rs. 4.50 per unit
• 201 -500 units - Rs. 6 per unit
• 501 units - Rs. 7 per unit*/
import java.util.Scanner;

class Electricity {
	// Consumer no., consumer name, previous month reading, current month reading
	private int cansumerno,premouread,cormouread;
	private String cansumername;
	Scanner sc = new Scanner(System.in);
	void getdata(){
		System.out.print("\nEnter Your Name : ");
		cansumername = sc.next();
		System.out.print("Enter EB Id No : ");
		cansumerno = sc.nextInt();
		System.out.print("Enter Your previous reading : ");
		premouread = sc.nextInt();
		System.out.print("Enter Your Current reading : ");
		cormouread = sc.nextInt();
	}

	void domestic(){

		System.out.print("cansumer Name : " + cansumername);
		premouread = cormouread - premouread;
		System.out.print("\nYou have used " + premouread + "in this Month\n\n");
		if(premouread <= 100)
			System.out.print("\tYour EB Amount is : " + premouread);
		else if(premouread <= 200)
			System.out.print("\tYour EB Amount is : " + premouread*2.50);
		else if(premouread <= 500)
			System.out.print("\tYour EB Amount is : " + premouread*4);
		else if(premouread > 500)
			System.out.print("\tYour EB Amount is : " + premouread*6);
		else System.out.print("check your reading again....");
	}

	void commercial(){
		System.out.print("cansumer Name : " + cansumername);
		premouread = cormouread - premouread;
		System.out.print("\nYou have used " + premouread + "in this Month\n\n");
		if(premouread <= 100)
			System.out.print("\tYour EB Amount is : " + premouread*2);
		else if(premouread <= 200)
			System.out.print("\tYour EB Amount is : " + premouread*4.50);
		else if(premouread <= 500)
			System.out.print("\tYour EB Amount is : " + premouread*6);
		else if(premouread > 500)
			System.out.print("\tYour EB Amount is : " + premouread*7);
		else System.out.print("check your reading again....");
	}

}


class ElectricityBill{
	public static void main(String[] argc){
		Scanner sc = new Scanner(System.in);
		Electricity EB = new Electricity();
		int opt=0;
		System.out.print("....Electricity Bill calculate....");
		EB.getdata();
		while(true){
			System.out.print("\n1.Domestic \n2.Commercial ");
			System.out.print("\nWhich type : ");
			opt = sc.nextInt();
			switch (opt){
				case 1:
					EB.domestic();
					break;
				case 2:
					EB.commercial();
					break;
				default:
					System.out.print("Enter Your Correct Option....");
			}

		}
	}
}
