package Week_3.polymorphism;

public class ConsoleLogger extends BaseLogger {
    public void Log(String message){
        System.out.println("Logged To console : " + message);
    }
}
