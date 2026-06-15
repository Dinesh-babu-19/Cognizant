import java.util.*;

public class InventoryManager{
    HashMap<Integer,Product> mp;

    public  InventoryManager(){
        mp = new HashMap<>();
    }

    public void addProduct(Product pr){
        if(mp.containsKey(pr.getProductId())){
            System.out.println("Already Product exists..");
        }else{
            mp.put(pr.getProductId(),pr);
            System.out.println("Successfully product added");
        }
    }

    public void updateProduct(int pid,String pname,int q,double p){
        Product product = mp.get(pid);

        if(product==null){
            System.out.println("Product doesnt exist");
        }else{
            product.setProductName(pname);
            product.setQuantity(q);
            product.setPrice(p);
        }
    }

    public void deleteProduct(int pid){
        if (mp.remove(pid) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts(){
        if (mp.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for(Product p:mp.values()){
            System.out.println(p);
        }
    }
}