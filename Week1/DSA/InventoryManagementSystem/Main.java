public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101,
                "Laptop",
                20,
                55000);

        Product p2 = new Product(102,
                "Mouse",
                100,
                500);

        Product p3 = new Product(103,
                "Keyboard",
                50,
                1200);

        // Add products
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\nInventory:");
        manager.displayProducts();

        // Update product
        manager.updateProduct(102,
                "Wireless Mouse",
                80,
                700);

        // Delete product
        manager.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");
        manager.displayProducts();
    }
}