import java.util.Scanner;

import Mypackage.converte.DistanceConverter;
import Mypackage.converte.TimeConverter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DistanceConverter dc = new DistanceConverter();
        TimeConverter tc = new TimeConverter();
        System.out.println("\t\t\tMenu Bar\n1.Km to Meter\n2.Meter to Km\n3.Miles to Km\n4.Km to Miles\n5.Hours to Minutes\n6.Minutes to Hours\n7.Minutes to Seconds\n8.Seconds to Minutes");
        while(true){
            System.out.print("Enter your Option : ");
            int opt = sc.nextInt();
            switch(opt){
                case 1:
                    System.out.print("Enter the Km : ");
                    float km = sc.nextFloat();
                    System.out.println("in Meter : " + dc.kmToMeter(km));
                    break;
                case 2:
                    System.out.print("Enter the meter : ");
                    float me = sc.nextFloat();
                    System.out.println("in Km ; " +dc.meterToKm(me));
                    break; 
                case 3:
                    System.out.print("Enter the Mile : ");
                    float mi = sc.nextFloat();
                    System.out.println("in Km : " + dc.milesToKm(mi));
                    break;
                case 4:
                    System.out.print("Enter the Km : ");
                    km = sc.nextFloat();
                    System.out.println("in Mile ; " +dc.kmToMiles(km));
                    break; 
                case 5:
                    System.out.print("Enter the Hours : ");
                    int hr = sc.nextInt();
                    System.out.println("in Minutes : " + tc.hoursToMin(hr));
                    break;
                case 6:
                    System.out.print("Enter the Minutes : ");
                    int min = sc.nextInt();
                    System.out.println("in Hours ; " +tc.minToHours(min));
                    break; 
                case 7:
                    System.out.print("Enter the Minutes : ");
                    min = sc.nextInt();
                    System.out.println("in Seconds : " + tc.minToSec(min));
                    break;
                case 8:
                    System.out.print("Enter the Second : ");
                    int sec = sc.nextInt();
                    System.out.println("in Minutes ; " +tc.secToMin(sec));
                    break; 
            }
        }
        
    }
}
