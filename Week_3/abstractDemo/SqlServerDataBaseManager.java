package Week_3.abstractDemo;

public class SqlServerDataBaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : SQL Server");
    }
}
