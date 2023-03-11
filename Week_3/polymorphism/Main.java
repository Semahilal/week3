package Week_3.polymorphism;

public class Main {
    public static void main(String[] args) {
/*
        BaseLogger[] loggers=new BaseLogger[]{new DataBaseLogger(),new FileLogger(),new EmailLogger(),new ConsoleLogger()};
        for (BaseLogger logger : loggers ){
            logger.Log("Al Girdin Girdin");
        }*/

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.Add();
    }
}
