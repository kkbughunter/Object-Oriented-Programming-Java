package geometricshapes;

public class Circle {
  private float PI = (float) 3.1415;
    public float circleArea(float r){
        return PI*(r*r);
    }
    public float circlePerimeter(float r){
        return 2*(PI * r);
    }
}
