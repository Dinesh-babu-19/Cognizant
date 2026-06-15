public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId,String productName,int quantity,double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }

    public int getProductId(){
        return productId;
    }

    public void setProductName(String name){
        this.productName=name;
    }

    public void setQuantity(int q){
        this.quantity=q;
    }

    public void setPrice(double p){
        this.price=p;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Quantity: " + quantity +
                ", Price: " + price;
    }

}