package oops;

public class circle extends shape{
    private double radius;
    public circle(double radius, String color){
        super(color);
        this.radius =radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
    public String getColor(){
        return super.getColor();
    }
}
