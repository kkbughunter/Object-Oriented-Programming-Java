import java.util.*;

class Person{
	private int aadhaar;
	private String name,address;
	private char gender;
	public static Scanner sc = new Scanner(System.in);
	
	Person(int aadhaar, String name, String adderss,  char gender){
		this.aadhaar = aadhaar;
		this.name = name;
		this.address = address;
		this.gender = gender;
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
}




class Faculty extends Person{
	private String designation, department;
	private float basicpay;
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
		double Net_salary = Gross_salary - Deductions; 
	}
}


class Student extends Person{
	
	private String program;
	int year, sub1_credit,sub2_credit,sub3_credit;
	char sub1_grade, sub2_grade, sub3_grade;
	Student(int aa,String n,String a,char g,String p,int y,char s1g,char s2g,char s3g,int s1c,int s2c,int s3c){
		super(aa, n, a, g);
		year=y, sub1_credit=s1c,sub2_credit=s2c,sub3_credit=s3c;
		sub1_grade=s1g, sub2_grade=s2g, sub3_grade=s3g;
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

	public void setsun1_grade(String addr){
		address = addr;
		System.out.println("\t\tAddress added Successfuly");
	}




} 





class Hierarchy{
	public static void main(String[] argc){
	 	String name,address;
		char gender;
		Person p = new Person(1,"2","3",'4');

		p.setAddress(p.getAddress());
		
	}

}

























































