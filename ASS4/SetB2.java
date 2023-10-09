interface Displayable { }
class Product implements Displayable {
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;
    private static int objectCount = 0;


    public Product() {
        objectCount++;
    }

    
    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        objectCount++;
    }

    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: $" + productCost);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println();
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

public class SetB2 {
    public static void main(String[] args) {

        Product product1 = new Product(101, "Laptop", 800.0, 5);
        Product product2 = new Product(102, "Mobile Phone", 500.0, 10);
        Product product3 = new Product(103, "Tablet", 300.0, 7);

        System.out.println("Details of Product 1:");
        product1.display();

        System.out.println("Details of Product 2:");
        product2.display();

        System.out.println("Details of Product 3:");
        product3.display();


        System.out.println("Total objects of class Product: " + Product.getObjectCount());
    }
}
