package calculator.server;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            Calculator calculator = new CalculatorImpl();

            // Start the RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            // Bind the remote object to the RMI registry
            Naming.rebind("CalculatorService", calculator);

            System.out.println("Server started.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
