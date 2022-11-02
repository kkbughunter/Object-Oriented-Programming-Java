import java.util.Scanner;
class Person{
    private String name,address,gender;
    private int aadhar;

    Person(int aadhar,String name,String address,String gender){
        this.aadhar=aadhar ;
        this.name=name;
        this.address=address;
        this.gender=gender;
    }
    void display1(){
      System.out.println("----------------------------------");
      System.out.println("Name   : "+name);
      System.out.println("Gender : "+gender);
    }
}
class Student extends Person{
   private int year,s1_credit,s2_credit,s3_credit;
   private String s1_grade,s2_grade,s3_grade,program;
   double CGPA;
   Student(int aadhar,String name,String address,String gender,String program,int year,String s1_grade,String s2_grade,String s3_grade,int s1_credit,int s2_credit,int s3_credit){
        super(aadhar,name,address,gender);
        this.program=program;
        this.year=year;
        this.s1_grade=s1_grade;
        this.s2_grade=s2_grade;
        this.s3_grade=s3_grade;
        this.s1_credit=s1_credit;
        this.s2_credit=s2_credit;
        this.s3_credit=s3_credit;
}
int point(String grade)
{
      switch(grade)
      {
          case "A": return 5;
          case "B": return 4;
          case "C": return 3;
          case "D": return 2;
          case "E": return 0;
          default : return -1;
      }
}
void calCGPA(){
        int G1,G2,G3;
        G1=(s1_credit)*point(s1_grade);
        G2=(s2_credit)*point(s2_grade);
        G3=(s3_credit)*point(s3_grade);
        CGPA=(G1+G2+G3)/(s1_credit+s2_credit+s3_credit);
}
  void display(){
      System.out.println("CGPA    : "+CGPA);
  }
}
class Faculty extends Person{
private String designation,department;
private double basicpay,GS,ded,netsalary;
Faculty(int aadhar,String name,String address,String gender,String designation,String department,double basicpay){
      super(aadhar,name,address,gender);
      this.designation=designation;
      this.department=department;
      this.basicpay=basicpay;
}
  void netSalary(){
      GS=basicpay+(0.6*basicpay)+(0.1*basicpay);
      ded=(0.085*basicpay)+(0.08*basicpay);
      netsalary=GS-ded;
  }
  void display(){
      System.out.println("Department   : "+ department);
      System.out.println("Designation  : "+ designation);
      System.out.println("Gross Salary : "+ GS);
      System.out.println("Net Salary   : "+ netsalary);
  }
}
class PersonProblem{
   public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      int n,c1=0,c2=0,i,s1_credit,s2_credit,s3_credit,year,aadhar;
      String name,address,program,designation,department,a,type;
      double basicpay;
      String gender,s1_grade,s2_grade,s3_grade;
     
      Student[] S=new Student[20];
      Faculty[] F=new Faculty[20];
 
      System.out.println("Enter the number of Persons:");
      n=obj.nextInt();
      for(i=0;i<n;i++){
          System.out.println("Enter student/faculty");
          a=obj.next();
          if(a.equals("student"))
          {
            System.out.print("Enter the name: ");
            name=obj.next();
            System.out.print("Enter the address: ");
            address=obj.next();
            System.out.print("Enter the aadhar num: ");
            aadhar=obj.nextInt();
            System.out.print("Enter the gender: ");
            gender=obj.next();
            System.out.print("Enter the program: ");
            program=obj.next();
            System.out.print("Enter the year: ");
            year=obj.nextInt();
            System.out.print("Enter the subject 1 grade: ");
            s1_grade=obj.next();
            System.out.print("Enter the subject 2 grade: ");
            s2_grade=obj.next();
            System.out.print("Enter the subject 3 grade: ");
            s3_grade=obj.next();
            System.out.print("Enter the subject 1 credit: ");
            s1_credit=obj.nextInt();
            System.out.print("Enter the subject 2 credit: ");
            s2_credit=obj.nextInt();
            System.out.print("Enter the subject 3 credit: ");
            s3_credit=obj.nextInt();
            S[c1]=new Student(aadhar,name,address,gender,program,year,s1_grade,s2_grade,s3_grade,s1_credit,s2_credit,s3_credit);
            S[c1++].calCGPA();
          }
          else
          {
              System.out.print("Enter the name: ");
              name=obj.next();
              System.out.print("Enter the address: ");
              address=obj.next();
              System.out.print("Enter the aadhar num: ");
              aadhar=obj.nextInt();
              System.out.print("Enter the department: ");
              department=obj.next();
              System.out.print("Enter the designation: ");
              designation=obj.next();
              System.out.print("Enter the gender: ");
              gender=obj.next();
              System.out.print("Enter the basicpay: ");
              basicpay=obj.nextDouble();
              F[c2]=new Faculty(aadhar,name,address,gender,designation,department,basicpay);
              F[c2++].netSalary();
            }
     }
     System.out.println("Student Details");
     for(i=0;i<c1;i++){
       S[i].display1();
       S[i].display();
     }
     System.out.println("Faculty Details");
      for(i=0;i<c2;i++){
       F[i].display1();
       F[i].display();
     }
}
}
