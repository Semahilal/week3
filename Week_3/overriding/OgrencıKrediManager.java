package Week_3.overriding;

public class OgrencıKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}
