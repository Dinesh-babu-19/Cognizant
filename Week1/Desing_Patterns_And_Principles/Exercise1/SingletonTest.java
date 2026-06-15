public class SingletonTest{
    public static  void main(String[] args){
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Application started.");
        l2.log("Processing data");

        if (l1 == l2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances exist.");
        }

        System.out.println("Logger1 HashCode: " + l1.hashCode());
        System.out.println("Logger2 HashCode: " + l2.hashCode());
    }
}