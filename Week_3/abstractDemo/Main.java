package Week_3.abstractDemo;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDataBaseManager();
        customerManager.getCustomers();
    }
}
