package oops;

public class person {
    private String name;
    private int age;

    // constructor
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println("Name: "+name+ " age: "+age);
    } 

}

