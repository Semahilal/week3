package Week_3.getterSetter;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Lenovo Laptop");
        product.setPrice(6000);
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}
