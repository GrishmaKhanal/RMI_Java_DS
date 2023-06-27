package FibonacciChecker.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args){
        try{
            FibonacciChecker fibonacci = new FibonacciCheckerImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("FibonacciService", fibonacci);
            System.out.println("Server started...");
        } catch(Exception e){
            System.err.println("Server exception: " + e.toString());
        }
    }
}