import java.util.Scanner;
class Employee{
    protected String Emp_name,Address,Mail_id,position,Mobile_num;
    protected int Emp_id;
    protected double BP,deductions,netsalary,gsalary,Allowance;

    Employee(String name,int id,String add,String mail,String num,double basic,String type,double allowance){
        Emp_name=name;
        Emp_id=id;
        Address=add;
        Mail_id=mail;
        Mobile_num=num;
        BP=basic;
        position=type;
        Allowance=allowance;
    }

    Employee()
    {
    }

    void grossSalary()
   {
      gsalary=(BP+0.17*BP+0.1*BP+Allowance);
      deductions=(0.12*BP+0.001*BP);
      netsalary=gsalary-deductions;
   }
   void display(){
      System.out.println("NAME: "+Emp_name);
      System.out.println("ID: "+Emp_id);
      System.out.println("Position: "+position);
      System.out.println("GROSS SALARY: "+gsalary);
      System.out.println("NET SALARY: "+netsalary);
   }
}
class Programmer extends Employee{
    Employee obj1=new Employee();
    Programmer(String name,int id,String add,String mail,String num,double basic,String type){
          super(name,id,add,mail,num,basic,type,2000);
        }
}
class AssisProf extends Employee{
      AssisProf(String name,int id,String add,String mail,String num,double basic,String type){
          super(name,id,add,mail,num,basic,type,5000);
       }
}
class AssoProf extends Employee{
      AssoProf(String name,int id,String add,String mail,String num,double basic,String type){
          super(name,id,add,mail,num,basic,type,10000);
        }
}
class Professor extends Employee{
     Professor(String name,int id,String add,String mail,String num,double basic,String type){
            super(name,id,add,mail,num,basic,type,15000);
        }
}
class EmployeeProblem{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        Employee obj1 = new Employee();
        String name="",add,mail,num;
        int id=0,n,pos,i,c1=0, c2=0, c3=0, c4=0;
      String type;
        double basic;
        Employee[] E=new Employee[10];
        System.out.print("num of employees:");
        n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("employee name :");
            name=obj.next();
            System.out.print("employee ID :");
            id=obj.nextInt();
			System.out.print("employee email :");
            mail=obj.next();
			System.out.print("employee address :");
            add=obj.next();
			System.out.print("employee moblie num :");
            num=obj.next();
			System.out.print("employee Basic Pay :");
            basic=obj.nextDouble();
            System.out.println("enter the position of employees(1.Programmer\n2.Assistant Professor\n3.Associative Professor\n4.Professor:");
            pos=obj.nextInt();
            switch(pos){
            case 1:
                type="Programmer";
                Programmer p1=new Programmer(name,id,add,mail,num,basic,type);
                p1.grossSalary();
                E[i]=p1;
                break;
            case 2:
                type="Assistant Professer";
               AssisProf a1=new AssisProf(name,id,add,mail,num,basic,type);
                a1.grossSalary();
                E[i]=a1;
                break;
            case 3:
                type="Associative Professer";
                AssoProf a2=new AssoProf(name,id,add,mail,num,basic,type);
                a2.grossSalary();
                E[i]=a2;
                break;
            case 4:
                type="Professer";
                Professor p2=new Professor(name,id,add,mail,num,basic,type);
                p2.grossSalary();
                E[i]=p2;
                break;
            }
        }
      for(i=0;i<n;i++){
        E[i].display();
      }
    }
}
