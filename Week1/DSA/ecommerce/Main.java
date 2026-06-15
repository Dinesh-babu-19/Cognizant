public class Main {

    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {

            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Book", "Education"),
                new Product(105, "Shoes", "Fashion")
        };

        int targetId = 104;

        System.out.println("Linear Search:");

        Product result = linearSearch(products, targetId);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nBinary Search:");

        result = binarySearch(products, targetId);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Product not found.");
        }
    }
}