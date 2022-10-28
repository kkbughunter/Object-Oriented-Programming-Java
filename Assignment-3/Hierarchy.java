// please check the CGPA calculation 

import java.util.*;

class Person{
	private int aadhaar;
	private String name,address;
	private char gender;
	public static Scanner sc = new Scanner(System.in);
	Person(){}
	Person(int aa, String n, String add,  char g){
		aadhaar = aa;
		name = n;
		address = add;
		gender = g;
	}
	public String getName(){
		String n = sc.nextLine();
		return n;
	}
	public char getGender(){
		char n = sc.next().charAt(0);
		return n;
	}
	public String getAddress(){
		String n = sc.nextLine();
		return n;
	}

	public void setAddress(String addr){
		address = addr;
		System.out.println("\t\tAddress added Successfuly");
	}
	public void displayPer(){
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Aadhaar : " + aadhaar);
		System.out.println("Gender : " + gender);
	}
}
class Faculty extends Person{
	private String designation, department;
	private float basicpay;
	double Net_salary;
	Faculty(int aa,String n,String a,char g,String de,String dept,float pay){
		super(aa, n, a, g);
		designation = de;
		department = dept;
		basicpay = pay;
	}

	public String getDesig(){
		String n = sc.nextLine();
		return n;
	}
	public float getBasic(){
		float n = sc.nextFloat();
		return n;
	}
	public void setDesig(String de){
		designation = de;
		System.out.println("\t\tDesignation added Successfuly");
	}
	public void setBasic(float pay){
		basicpay = pay;
		System.out.println("\t\t Basicpay added Successfuly");
	}
	public void calSalary(float pay){
		double DA = (60/100)*pay , HRA = (10/100)*pay,Medical_Insurance = (8.5/100)*pay,PF = (8/100)*pay ;
		double Gross_salary = pay + DA + HRA;
		double Deductions = Medical_Insurance  + PF;
		Net_salary = Gross_salary - Deductions;
	}
	public void displayFal(){
		
		System.out.println("Department : "+department);
		System.out.println("Designation : "+designation);
		System.out.println("Basicpay : "+basicpay);
		System.out.println("Net salary : "+Net_salary);
	}
}


class Student extends Person{

	private String program;
	int year, sub1_credit,sub2_credit,sub3_credit;
	float CGPA;
	char sub1_grade, sub2_grade, sub3_grade;
	Student(){}
	Student(int aa,String n,String a,char g,String p,int y,char s1g,char s2g,char s3g,int s1c,int s2c,int s3c){
		super(aa, n, a, g);
		program=p;
		year=y;
		sub1_credit=s1c ;
		sub2_credit=s2c;
		sub3_credit=s3c;
		sub1_grade=s1g;
		sub2_grade=s2g;
		sub3_grade=s3g;
	}

	public String getProgram(){
		String n = sc.nextLine();
		return n;
	}
	public int getYear(){
		int n = sc.nextInt();
		return n;
	}
	//--------------
	public int getsub1_credit(){
		int n = sc.nextInt();
		return n;
	}
	public int getsub2_credit(){
		int n = sc.nextInt();
		return n;
	}
	public int getsub3_credit(){
		int n = sc.nextInt();
		return n;
	}

	//--------------
	public char getsub1_grade(){
		char n = sc.next().charAt(0);
		return n;
	}
	public char getsub2_grade(){
		char n = sc.next().charAt(0);
		return n;
	}
	public char getsub3_grade(){
		char n = sc.next().charAt(0);
		return n;
	}
	//--------------------------------------------------------------

	private void setsub1_grade(char g){
		sub1_grade = g;
		System.out.println("\tUpdated added Successfuly");
	}
	private void setsub2_grade(char g){
		sub2_grade = g;
		System.out.println("\tUpdated added Successfuly");
	}
	private void setsub3_grade(char g){
		sub3_grade = g;
		System.out.println("\tUpdated added Successfuly");
	}
	private void setsub1_credit(int c){
		sub1_credit = c;
		System.out.println("\tUpdated added Successfuly");
	}
	private void setsub2_credit(int c){
		sub2_credit = c;
		System.out.println("\tUpdated added Successfuly");
	}
	private void setsub3_credit(int c){
		sub3_credit = c;
		System.out.println("\tUpdated added Successfuly");
	}
	public void calGPA(){
		int gr1 = (int) sub1_grade;
		gr1 = (gr1 - 70)*-1;
		int gr2 = (int) sub2_grade;
		gr2 = (gr2 - 70)*-1;
		int gr3 = (int) sub3_grade;
		gr3 = (gr3 - 70)*-1;
		CGPA = ((gr1*sub1_credit)+(gr1*sub1_credit)+(gr1*sub1_credit))/(sub1_credit+sub2_credit+sub3_credit);
	}
	public void displayStu(){
		System.out.println("Program : "+program);
		System.out.println("Year : "+year);
		System.out.println("CGPA : "+CGPA);
	}
}

class Hierarchy{
	public static void main(String[] argc){
		Scanner sc = new Scanner(System.in);
		int aa,year,c1,c2,c3,opt;
		float pay;
		String dept,de,name,add,prog;
		char g,g1,g2,g3;
		System.out.print("1. Student \n2. Faculity\nEnter your option : ");
		opt = sc.nextInt();
		switch(opt){
			case 1:
				System.out.print("Enter your Name : ");
				name = sc.nextLine();
				name = sc.nextLine();
				System.out.print("Enter your address : ");
				add = sc.nextLine();
				System.out.print("Enter your Gender : ");
				g = sc.next().charAt(0);
				System.out.print("Enter your Program : ");
				prog = sc.nextLine();
				prog = sc.nextLine();
				System.out.print("Enter your Aadhaar No : ");
				aa = sc.nextInt();
				System.out.print("Enter your year : ");
				year = sc.nextInt();
				System.out.print("Enter your grade 1 : ");
				g1 = sc.next().charAt(0);
				System.out.print("Enter your grade 2 : ");
				g2 = sc.next().charAt(0);
				System.out.print("Enter your grade 3 : ");
				g3 = sc.next().charAt(0);
				System.out.print("Enter your credit 1 : ");
				c1 = sc.nextInt();
				System.out.print("Enter your credit 2 : ");
				c2 = sc.nextInt();
				System.out.print("Enter your credit 3 : ");
				c3 = sc.nextInt();
				Student s = new Student(aa,name,add,g,prog,year,g1,g2,g3,c1,c2,c3);
				s.displayPer();
				s.displayStu();
				break;
			case 2:
				System.out.print("Enter your Name : ");
				name = sc.nextLine();
				name = sc.nextLine();
				System.out.print("Enter your address : ");
				add = sc.nextLine();
				System.out.print("Enter your Gender : ");
				g = sc.next().charAt(0);
				System.out.print("Enter your Aadhaar No : ");
				aa = sc.nextInt();
				System.out.println("Enter the Department : ");
				dept = sc.nextLine();
				dept = sc.nextLine();
				System.out.println("Enter the Designation : ");
				de = sc.nextLine();
				System.out.println("Enter the Basicpay : ");
				pay = sc.nextFloat();
				Faculty f = new Faculty(aa, name, add, g, de, dept, pay);
				f.calSalary(pay);
				f.displayPer();
				f.displayFal();
			default:System.out.println("Enter the correct output...");
		}
	}

}
