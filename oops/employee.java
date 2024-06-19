package oops;

public class employee {
    private String name;
    private int age;
    private double salary;

    // constructor
    public employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void giveRaise(double percentage){
        salary+=salary*(percentage/100);

    }

}
