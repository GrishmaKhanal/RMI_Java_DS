package fibonacci.client;
import java.rmi.Naming;
import java.util.Scanner;

import fibonacci.server.Fibonacci;
public class Client {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            Fibonacci fibonacci = (Fibonacci) Naming.lookup("rmi://localhost/FibonacciService");
            System.out.print("Enter a n for Fibonacci(n): ");
            int n = scanner.nextInt();
            System.out.println("Fibonacci("+ n +"): " + fibonacci.fib(n));
        } catch(Exception e){
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}