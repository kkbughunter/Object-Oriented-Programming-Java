import java.util.Scanner;

import geometricshapes.*;
public class Main {
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        System.out.println("\t\t\tMenu Bar\n1.Area of Circle\n2.Perimeter of Circle\n3.Area of Rectangle\n4.Perimeter of Rectangle\n5.Area of Square\n6.Perimeter of Square\n");
        while(true){
            System.out.print("Enter your option : ");int opt =sc.nextInt();
            switch(opt){
                case 1:
                    System.out.print("Enter Circle radius : ");float ra = sc.nextFloat();
                    System.out.println("Area of the Circle : " + c.circleArea(ra));
                    break;
                case 2:
                    System.out.print("Enter Circle radius : ");ra = sc.nextFloat();
                    System.out.println("Perimeter of the Circle : " + c.circlePerimeter(ra));
                    break;
                case 3:
                    System.out.print("Enter Rectangle Length : ");float l = sc.nextFloat();
                    System.out.print("Enter Rectangle Width  : ");float w = sc.nextFloat();
                    System.out.println("Area of the Rectangle : " + r.rectangleArea(l,w));
                    break;
                case 4:
                    System.out.print("Enter Rectangle Length : "); l = sc.nextFloat();
                    System.out.print("Enter Rectangle Width  : "); w = sc.nextFloat();
                    System.out.println("Perimeter of the Rectangle : " + r.rectanglePerimeter(l,w));
                    break;
                case 5:
                    System.out.print("Enter Square sides : "); float si = sc.nextFloat();
                    System.out.println("Area of the Square : " + s.squareArea(si));
                    break;
                case 6:
                    System.out.print("Enter Square sides : ");  si = sc.nextFloat();
                    System.out.println("APerimeterrea of the Square : " + s.squareArea(si));
                    break;


            }
        }
        
        
    }  
}
