package calculator.client;
import java.rmi.Naming;

import calculator.server.Calculator;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object from the RMI registry
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");

            // Invoke remote methods
            System.out.println("Addition: " + calculator.add(5, 3));

            System.out.println("Subtraction: " + calculator.subtract(7, 2));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
