import java.util.*;

class Person{
    Scanner in = new Scanner(System.in);
    private String name, address;
    Person(String n, String a){
        name = n;
        address = a;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    void setAddress(){
        System.out.print("Enter Your Address : ");
        String add = in.nextLine();
        address = add;
    }
}

abstract class Employee extends Person{
    Scanner in = new Scanner(System.in);
    private String empid, dept;
    private int basic=2309;
    Employee(String n,String a,String ei,String d,int b){
        super(n,a);
        empid = ei;
        dept = d;
        basic = b;

    }
    String getempid(){
        return empid;
    }
    String getdept(){
        return dept;
    }
    void setDept(){
        System.out.print("Enter Your Address : ");
        String d = in.nextLine();
        dept = d;
    }
    void setBasic(){
        System.out.print("Enter Your Address : ");
        int b = in.nextInt();
        basic = b;
    }
    int getBasic(){
        return basic;
    }
    abstract float calSalary();         // abstract method
}

class Faculity extends Employee{
    private String designation,course;
    Faculity(String n,String a,String ei,String d,int b,String des,String cou){
        super(n, a, ei, d, b);
        designation =des;
        course = cou;
    }
    float calSalary(){                  // abstract method Body
        return getBasic() + 230.32f;
    }
    String getDesignation(){
        return designation;
    }
    String getCourse(){
        return course;
    }
}

interface Student{
    float[] getMarks();
    float calcGPA();
}

class TeachingAssitant  extends Faculity implements Student {

    float[] mark = {0f,0f,0f};
    TeachingAssitant(String n, String a, String ei, String d, int b, String des, String cou) {
        super(n, a, ei, d, b, des, cou);
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your mark 1 : ");
        mark[0] = in.nextInt();
        System.out.print("Enter your mark 1 : ");
        mark[1] = in.nextInt();
        System.out.print("Enter your mark 1 : ");
        mark[2] = in.nextInt();
    }

    public float[] getMarks(){
        return mark;
    }

    public float calcGPA() {
        float[] mark = getMarks();
        return ((mark[0]*3 + mark[0]*3 + mark[0]*3)/9);
    }
}

class PersonProblem{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TeachingAssitant[] f = new TeachingAssitant[10];
        String n, a, ei, d, des, cou;
        int b,len;
        System.out.print("Enter Number of Person : ");
        len = in.nextInt();
        for(int i=0; i<len; i++){
            System.out.print("Enter your name : ");
            n = in.nextLine();
            n = in.nextLine();
            System.out.print("Enter your Address : ");
            a = in.nextLine();
            System.out.print("Enter your Emp ID : ");
            ei = in.nextLine();
            System.out.print("Enter your Department : ");
            d = in.nextLine();
            System.out.print("Enter your designation : ");
            des = in.nextLine();
            System.out.print("Enter your course : ");
            cou = in.nextLine();
            System.out.print("Enter your Basic pay : ");
            b = in.nextInt();
            f[i] = new TeachingAssitant(n, a, ei, d, b, des,cou);
        }
        System.out.flush();
        System.out.println(".----------------.---------------.------------.--------.--------.-----------.--------------.--------.");
        System.out.println("| Name           | Address       | Department | Emp ID | Course | Basic Pay | Salary       |  GPA   |");
        System.out.println("|----------------|---------------|------------|--------|--------|-----------|--------------|--------|");
        for(int i=0; i<len; i++){
            String temp = new String();
            temp +=String.format("|%-16s| %-13s | %-10s | %-6s | %-6s | %-9d | %f | %-6f |\n",f[i].getName(),f[i].getAddress(),f[i].getdept(),f[i].getempid(),f[i].getCourse(),f[i].getBasic(),f[i].calSalary(),f[i].calcGPA());
            
            System.out.printf(temp);
        }
        System.out.println(".----------------.---------------.------------.--------.--------.-----------.--------------.--------.");
    }
}

/*

2
karthikeyan
chennai
as12
CSE
teacher
DBMS
50000
Muthu
chennai
vf412
CSE
teacher
C++
45000

            System.out.printf("|%-16s| %-15s | %-12s | %-8s | %-8 | %-11d | %-8f |\n",f[i].getName(),f[i].getAddress(),f[i].getdept(),f[i].getempid(),f[i].getCourse(),f[i].getBasic(),f[i].calSalary());




 */