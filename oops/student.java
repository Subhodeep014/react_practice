package oops;

public class student extends person{
    private String studentId;

    public student(String name, int age, String studentId){
        super(name, age);
        this.studentId = studentId;
    }
    public String getStudentId(){
        return studentId;
    }

    public void display(){
        super.display();
        System.out.println("StudentID: "+ studentId);
    }
}
