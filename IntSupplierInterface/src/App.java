import java.util.function.IntSupplier;

public class App {
    public static void main(String[] args) throws Exception {
        
        IntSupplier supplier = () -> (int)(Math.random() * 10); 
    
        System.out.println(supplier.getAsInt()); 
    }
}
