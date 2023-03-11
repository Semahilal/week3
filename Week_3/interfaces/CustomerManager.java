package Week_3.interfaces;

public class CustomerManager {
    ICustomerDal customerDal;

    public CustomerManager (ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void add(){
        //iş kodlar
        customerDal.add();
    }
}
