abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void accept();
    public abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;

    public PurchaseOrder(int id, String description, String customerName) {
        super(id, description);
        this.customerName = customerName;
    }

    @Override
    public void accept() {
        
        System.out.println("Purchase Order Accepted: ID = " + id + ", Description = " + description + ", Customer Name = " + customerName);
    }

    @Override
    public void display() {
        
        System.out.println("Purchase Order Details: ID = " + id + ", Description = " + description + ", Customer Name = " + customerName);
    }
}

class SalesOrder extends Order {
    private String vendorName;

    public SalesOrder(int id, String description, String vendorName) {
        super(id, description);
        this.vendorName = vendorName;
    }

    @Override
    public void accept() {
        
        System.out.println("Sales Order Accepted: ID = " + id + ", Description = " + description + ", Vendor Name = " + vendorName);
    }

    @Override
    public void display() {

        System.out.println("Sales Order Details: ID = " + id + ", Description = " + description + ", Vendor Name = " + vendorName);
    }
}

public class SetB1 {
    public static void main(String[] args) {

        PurchaseOrder[] purchaseOrders = {
            new PurchaseOrder(101, "Purchase Description 1", "Customer 1"),
            new PurchaseOrder(102, "Purchase Description 2", "Customer 2"),
            new PurchaseOrder(103, "Purchase Description 3", "Customer 3")
        };

        SalesOrder[] salesOrders = {
            new SalesOrder(201, "Sales Description 1", "Vendor 1"),
            new SalesOrder(202, "Sales Description 2", "Vendor 2"),
            new SalesOrder(203, "Sales Description 3", "Vendor 3")
        };

        
        System.out.println("Purchase Orders:");
        for (PurchaseOrder po : purchaseOrders) {
            po.accept();
            po.display();
            System.out.println();
        }


        System.out.println("Sales Orders:");
        for (SalesOrder so : salesOrders) {
            so.accept();
            so.display();
            System.out.println();
        }
    }
}
