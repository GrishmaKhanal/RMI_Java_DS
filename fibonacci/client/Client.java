package fibonacci.client;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args){
        try{
            Fibonacci fibonacci = (Fibonacci) Naming.lookup("rmi://localhost/FibonacciService");
            System.out.println("Fibonacci(5): " + fibonacci.fib(5));
            System.out.println("Fibonacci(10): " + fibonacci.fib(10));
            System.out.println("Fibonacci(15): " + fibonacci.fib(15));
        } catch(Exception e){
            System.err.println("Client exception: " + e.toString());
        }
    }
}
