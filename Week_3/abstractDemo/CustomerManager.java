package Week_3.abstractDemo;

public class CustomerManager {

    BaseDatabaseManager databaseManager ;

    public void getCustomers(){

        databaseManager.getData();

      /*
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();

        //Yukarıdaki kullanım şekliyle geçmiş olsun artık Oracle Database Manager a bağımlıyız
        //Ve eğer müşteri Oracle veri tabanını değil de SQL veritabanını kullanıyorsa kodu full değiştşrmemiz gerekir.
*/


    }
}
