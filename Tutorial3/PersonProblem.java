
import java.util.*;
class Person{
  protected String name;
  protected String address;
  protected int age;
  protected String dob;
  protected String type;
  protected String performance;

  Person(String n,String address, int age,String dob,String type){
    this.name=n;
    this.address=address;
    this.age=age;
    this.dob=dob;
    this.type=type;
  }
  void display(){
    System.out.println("-----------------------------------");
    System.out.println("Name       : "+name);
    System.out.println("Address    : "+address);
    System.out.println("Age        : "+age);
    System.out.println("DOB        : "+dob);
    System.out.println("Type       : "+type);
    System.out.println("Perfomance : "+performance);
  }
}
class Student extends Person{
  String dept;
  double marks;
  int extra_curricular_score;
  Student(String n,String address, int age,String dob,String dept,double marks,int extra){
    super(n,address,age,dob,"Student");
   
    this.marks=marks;
    this.extra_curricular_score=extra;
  }
  void cal1(){
    if((marks>85)&&(extra_curricular_score>85)){
      super.performance="Outstanding";
    }
    else if((marks>70)&&(extra_curricular_score>70)){
      super.performance="Excellent";
    }
    else if((marks>75)&&(extra_curricular_score>75)){
      super.performance="Good";
    }
    else{
      super.performance="Fair";
    }
   
  }
}
class Professor extends Person{
  String dept;
  int publications;
  int funded_projects;
 
  Professor(String n, String address, int age,String dob,String dept,int publications,int projects){
    super(n,address,age,dob,"Professor");
    this.publications=publications;
    this.funded_projects=projects;
  }
  void cal(){
    if((publications>5)&&(funded_projects>5)){
      super.performance="Outstanding";
    }
    if((publications>3)&&(funded_projects>3)){
      super.performance="Excellent";
    }
    else if((publications>2)&&(funded_projects>2)){
      super.performance="Good";
    }
    else{
      super.performance="Fair";
    }
   
  }
}
class PersonProblem{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Persons");
    int n=sc.nextInt();
    Person p[]=new Person[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter name: ");
      String name=sc.next();
   
      System.out.print("Enter address: ");
      String add=sc.next();

      System.out.print("Enter dob: ");
      String dob=sc.next();
   
      System.out.print("Enter age: ");
      int age=sc.nextInt();
   
      System.out.print("Enter type: ");
      String type=sc.next();
     
     
      if(type.equals("Student")){
        System.out.print("Enter department: ");
      String dept=sc.next();
       
        System.out.print("Enter marks: ");
      double marks=sc.nextDouble();
     
        System.out.print("Enter extra curricular score: ");
      int extra=sc.nextInt();

        Student x =new Student(name,add,age,dob,dept,marks,extra);
        x.cal1();
        p[i] = x;
      }  
      else{
        System.out.print("Enter department: ");
      String dept =sc.next();
     
        System.out.print("Enter number of publications: ");
      int publications=sc.nextInt();
       
        System.out.print("Enter number of funded projects: ");
      int projects=sc.nextInt();
       
     
        Professor y =new Professor(name,add,age,dob,dept,publications,projects);
        y.cal();
        p[i]=y;
      }
    }
    for(int i=0;i<n;i++){
      p[i].display();
    }
     
    }
}