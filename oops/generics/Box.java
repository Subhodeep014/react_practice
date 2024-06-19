

public class Box<T> {
    private T content;
    public  Box(T content){
        this.content = content;
    }
    public void getContent(){
        System.out.println(content);
    }
}
