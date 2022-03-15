import java.util.function.DoubleSupplier;


public class App {
    public static void main(String[] args) throws Exception {
        
        DoubleSupplier supplier = () -> (int)(Math.random() * 10); 
    
        System.out.println(supplier.getAsDouble()); 
    }
}
