package Week_3.polymorphism;

public class EmailLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged To email : " + message);
    }
}
