package Week_3.abstractClasses;

public abstract class GameCalculator extends BaseCalculator {
    public abstract void hesapla();
    //ama hesapla metodunu kullanan kişi hesaplayı override etmek zorunda çünkü abstract ve default bir değeri yok

    //game over metodunu kim kullanıyorsa onu değiştiremez, ezemez çünkü final var.
    public final void GameOver (){
        System.out.println("Oyun Biti ! ");
    }

    //Abstract bir classta illaki abstract bir metot olma zorunluluğu yok.


}
