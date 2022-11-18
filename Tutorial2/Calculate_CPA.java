import java.util.*;

public class Calculate_CPA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,num_of_sub;
        float total_CGPA=0;
        System.out.print("Enter number of subject : ");
        num_of_sub = sc.nextInt();
        for(i=0; i<num_of_sub; i++){
            System.out.print("Enter the subject Grade Point " + i + " : ");
            float grade_point = sc.nextInt();
            System.out.print("credit for " + i + " subject : ");
            float credit_point = sc.nextFloat();
            total_CGPA  += (grade_point*credit_point);
        }
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("Total CGPA : " + total_CGPA);
        System.out.print("Enter Total number of CGPA point : ");
        float total_Point = sc.nextInt();
        System.out.print("\n\n\t\tTotal CGPA : " + (total_CGPA / total_Point)  + "\n\n");

    }
}

