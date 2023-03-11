package Week_3.staticDemo;

public class ProductValidator {

    static{
        System.out.println("Static blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid( Product product){
        if (!product.name.isEmpty() && product.price>0){
            return true;
        }else return false;
    }
    public void biSey(){

    }
}
