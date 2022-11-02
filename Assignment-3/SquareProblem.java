import java.util.*;
class Shape{
    protected String colour;
    Scanner scn = new Scanner(System.in);
    public Shape(){
        colour = "red";
    }
    public Shape(String c){
        colour = c;
    }
    public String getColour(){
        System.out.print("Enter the colour: ");
        String c = scn.next();
        return c;
    }
    public void setColour(String c){
        colour = c;
    }
}
class Circle extends Shape{
    protected float radius;
    public Circle(){
        super();
        radius =1.0f;
    }
    public Circle(float radius){
        String c = getColour();
        setColour(c);        
        this.radius = radius;
    }
    public Circle(float radius , String colour){
        super(colour);
        this.radius = radius;
    }
    public float getRadius(){
        System.out.print("Enter the radius of the circle: ");
        float r = scn.nextFloat();
        return r;
    }
    public void setRadius(float r){
        radius = r;
    }
    public float getArea() {
        return 3.14f*radius*radius;
    }
    public float getPerimeter(){
        return 2*3.14f*radius;
    }
    public void display(){
        System.out.println("Details of CIRCLE is: ");
        System.out.println("Colour is :"+colour);
        System.out.println("Radius is: "+radius);
        System.out.println("Area of the circle is: "+getArea());
        System.out.println("Perimeter of the circle is: "+getPerimeter());
    }
}
class Rectangle extends Shape
{
    protected float width;
    protected float length;
    public Rectangle() {
        super();
        width = 1.0f;
        length = 1.0f;
    }
    public Rectangle(float width,float length) {
        String c = getColour();
        setColour(c);
        this.width = width;
        this.length = length;
    }
    public Rectangle(float width,float length,String colour){
        super(colour);
        this.width = width;
        this.length = length;
    }
    public float getWidth(){
        System.out.print("Enter the width of the rectangle: ");
        float w = scn.nextFloat();
        return w;
    }
    public void setWidth(float w){
        width = w;
    }
    public float getLength(){
        System.out.print("Enter the length of the rectangle: ");
        float l = scn.nextFloat();
        return l;
    }
    public void setLength(float l){
        length = l;
    }
    public float getArea(){
        return width*length;
    }
    public float getPerimeter(){
        return 2*(width+length);
    }
    public void display(){
        System.out.println("Details of RECTANGLE is: ");
        System.out.println("Colour is :"+colour);
        System.out.println("Length is: "+length);
        System.out.println("Width is: "+width);
        System.out.println("Area of the rectangle is: "+getArea());
        System.out.println("Perimeter of the rectangle is: "+getPerimeter());
    }
}
class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(float side){
        super(side,side);
    }
    public Square(float side,String colour){
        super(side,side,colour);
    }
    public float getSide(){
        System.out.print("Enter the side of the square: ");
        float s= scn.nextFloat();
        return s;
    }
    public void setSide(float s) {
        setWidth(s);
        setLength(s);
    }
    public void display(){
        System.out.println("Details of SQUARE is: ");
        System.out.println("Colour is :"+colour);
        System.out.println("Side1 is: "+length);
        System.out.println("Area of the square is: "+getArea());
        System.out.println("Perimeter of the square is: "+getPerimeter());
    }
}
class SquareProblem{
    public static void main(String[] argv)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = scn.nextInt();
        Shape[] shps = new Shape[n];
        Rectangle[] r = new Rectangle[n];
        Circle[] c = new Circle[n];
        Square[] s = new Square[n];
        int i=0;
        float rad,side,len,bred;
        for(i=0;i<n;i++){
            if (i==0){
            System.out.println("Calling the base class Constructor with default constructor and the subclasses' default constructor");
            shps[i]=new Shape();
            r[i]=new Rectangle();
            c[i]=new Circle();
            s[i]=new Square();
            c[i].display();
            r[i].display();
            s[i].display();         
            System.out.println("Calling the sub class constructors with arguments input from user in 'main' !");
            System.out.print("Enter the colour of the shapes: ");
            String colour = scn.next();
            System.out.print("Enter the radius of the circle: ");
            rad = scn.nextFloat();
            System.out.print("Enter the length of the rectangle: ");
            len = scn.nextFloat();
            System.out.print("Enter the width of the rectangle: ");
            bred = scn.nextFloat();
            System.out.print("Enter the side of the square: ");
            side = scn.nextFloat();
            r[i]=new Rectangle(bred,len,colour);
            c[i]=new Circle(rad,colour);
            s[i]=new Square(side,colour);
            c[i].display();
            r[i].display();
            s[i].display();
            }
            
            else{
            System.out.println("Calling the sub class  with get input functions inside the 'class' !");
            r[i]=new Rectangle();
            c[i]=new Circle();
            s[i]=new Square();
            rad = c[i].getRadius();
            bred = r[i].getWidth();
            len = r[i].getLength();
            side = s[i].getSide();
            c[i].setRadius(rad);
            r[i].setWidth(bred);
            r[i].setLength(len);
            s[i].setSide(side);
            c[i].display();
            r[i].display();
            }
            
        }
    }
}