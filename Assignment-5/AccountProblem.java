import java.util.Scanner;
// C and D not completed

class MyException extends Exception{
    MyException(String exp){
        super(exp);
    }
}


class Account{
    private String name, branch,pan="h";
    private int acct_num, balance=88;
    Scanner sc = new Scanner(System.in);
    public void getInput(){
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
        System.out.print("Enter Your Pan No : ");
        pan = sc.nextLine();
        System.out.print("Enter Your Branch : ");
        branch = sc.nextLine();
        System.out.print("Enter Your Account No : ");
        acct_num = sc.nextInt();
        System.out.print("Enter Your Balance : ");
        balance = sc.nextInt();
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Pan No : " + pan);
        System.out.println("Account No : " + acct_num);
        System.out.println("Branch : " + branch);
        System.out.println("Balance : " + balance);
    }

    public void depositMoney(){
        int flag = 0;
        System.out.print("Enter Money to be Deposit : ");
        int mon = sc.nextInt();
        try{
            if(mon >= 25000) throw new MyException("PANRequiredException");
        }
        catch(MyException e){
            System.out.println("\t\t\t" + e.getMessage());
            flag = 1;
        }
        if(flag == 1){
            System.out.print("Enter Your Pan No : ");
            String pancheck = sc.nextLine();
            pancheck = sc.nextLine();
            if(pancheck.equals(pan)){
                balance += mon;
                System.out.print("Money Deposit Successfully... ");
            }
        }
        else balance += mon;
    }

    public void withdroaw(){
        System.out.print("Enter Money to be Withdroaw : ");
        int mon = sc.nextInt();
        int flag = 0;
        try{
            if(balance < 1000) throw new MyException("MinBalRequiredException");
        }
        catch(MyException e){
            System.out.println("\t\t\t" + e.getMessage());
            flag = -1;
        }
        try{
            if(( balance - mon) < 1000) throw new MyException("NotEnougMoneyInAccountException");
        }
        catch(MyException e){
            System.out.println("\t\t\t" + e.getMessage());
            flag = -1;
        }
        if(flag == 0){
            balance -= mon;
            System.out.print("Money Withdroaw Successfully.... ");
        }
    }
    public void panVerification(){
        int flag =0;
        System.out.print("Enter Your Pan No : ");
        pan = sc.nextLine();
        // char testpan = pan.charAt(pan);
        // pan.toLowerCase();
        if(pan.length() <= 10){
            for(int i=0; i<pan.length(); i++){
                if(pan.charAt(i) < 'a' || pan.charAt(i) > 'z' ) {
                    if(i< 5){
                        flag = -1;
                        break;}}
                else if(pan.charAt(pan.length()-1) <'a' && pan.charAt(pan.length()-1) <'z'){
                    flag = -1;
                    break;}
            }
        }
        try {
            if(flag == -1) throw new MyException("PANFormatMismatchException");
        }
        catch(MyException e){
            System.out.println("\t\t\t" + e.getMessage());
        }
        if(flag == 0) System.out.println("Pam Verifed Successfully....");
        
    }
}


class AccountProblem{
    public static void main(String[] args) {
        Account a = new Account();
        Scanner sc = new Scanner(System.in); 
        String clear;  
        while(true){
            System.out.print("\t\t Menu Bar\n1. Get Input\n2.Pan Verification\n3. Deposit\n4. Withdroaw\n5. Display\nEnter your option : ");
            int opt = sc.nextInt();
            switch(opt){
                case 1:
                    a.getInput();
                    break;
                case 2:
                    a.panVerification();
                    break;
                case 3:
                    a.depositMoney();
                    break;
                case 4:
                    a.withdroaw();
                    break;
                case 5:
                    a.display();
                    break;
                    
            }

            System.out.print("press any key to continue...");
            clear = sc.nextLine();
            clear = sc.nextLine();
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            
        }
    }
}








