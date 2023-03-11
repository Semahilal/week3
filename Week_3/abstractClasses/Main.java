package Week_3.abstractClasses;

public class Main {
    public static void main(String[] args) {
        /*WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.GameOver();
*/
      //Abstract sınıflar asla new lenemez. New lenmesi için içindeki metotların override edilmesi gerekir Ama bu iyi bir kullanım değildir

        KidsGameCalculator kidsGameCalculator= new KidsGameCalculator();
        kidsGameCalculator.hesapla();
        // Ama bir operasyona parametre olarak gamecalculator kullanıp başka bir sınıfı new leyebilirim

    }

}
