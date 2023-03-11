package Week_3.staticDemo;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name="Key";
        product.price =10;
        ProductManager manager = new ProductManager();
        manager.add(product);

    }

}
