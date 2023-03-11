package Week_3.polymorphism;

public class FileLogger  extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged To File : " + message);
    }
}
