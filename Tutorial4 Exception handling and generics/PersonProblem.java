import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}
class Person {
    Scanner sc = new Scanner(System.in);        
    private String name, aadharnumber=null;
    private int age;
    public void getInput(){
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        int flag =2;
        while(flag != 0){
            try{
                System.out.print("Enter your Age : ");
                String age1 = sc.nextLine();
                age = Integer.parseInt(age1);
                flag = 2;
            }
            catch(NumberFormatException e){
                System.out.println("Please enter the correct age...");
                flag = 1;
            }
            if(flag != 1) flag = 0;
        }
        System.out.print("Enter your Aadhar Number : ");
        aadharnumber = sc.nextLine();
    }

    public void licenceApproval(){
        int flag =0;
        try{
            
            if(aadharnumber.equals("")) throw new NullPointerException();
            System.out.println("\t\t\tAadher Number is Valid");
            
        }
        catch(NullPointerException e){
            System.out.println("\t\t\tUserAadherNotAcceptedException");
            flag =1;
        }
        try{
            if(age <=18) throw new MyException("MinorCitizenException");
        }catch (MyException e) {
            System.out.println("\t\t\t" + e.getMessage());
            flag =1;
        }
        if(flag == 0) System.out.println("\t\t\tlicence Approval");
    }
    public void display(){
        System.out.println("D\t\tData");
        System.out.println("Name ; " + name);
        System.out.println("Age : " + age);
        System.out.println("Aadher no : " + aadharnumber);
        System.out.println("....Thank You....");
    }
}


class PersonProblem{
    public static void main(String[] args) {
        Person p = new Person();
        Scanner sc = new Scanner(System.in); 
        String clear;  
        while(true){
            System.out.print("\t\t Menu Bar\n1. Get Input\n2. Check licence Approval\n3. Display\nEnter your option : ");
            int opt = sc.nextInt();
            switch(opt){
                case 1:
                    p.getInput();
                    break;
                case 2:
                    p.licenceApproval();
                    break;
                case 3:
                    p.display();
                    break;
                    
            }

            System.out.print("press any key to continue...");
            clear = sc.nextLine();
            clear = sc.nextLine();
            // System.out.print("\033[H\033[2J");  
            // System.out.flush();  
            
        }
        
    }
}