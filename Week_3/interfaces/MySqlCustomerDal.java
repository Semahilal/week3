package Week_3.interfaces;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
