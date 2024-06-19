package oops;

abstract public class shape {
    private String color;
    public shape(String color){
        this.color = color;
    }
    abstract double area();

    public String getColor(){
        return color;
    }
}
