package FibonacciChecker.client;

import java.rmi.Naming;
import java.util.Scanner;

import FibonacciChecker.server.FibonacciChecker;
public class Client {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            FibonacciChecker fibonacci = (FibonacciChecker) Naming.lookup("rmi://localhost/FibonacciService");
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (fibonacci.isFibonacci(number)) {
                int position = fibonacci.getFibonacciPosition(number);
                System.out.println(number + " is part of the Fibonacci sequence at position " + position);
            } else {
                System.out.println(number + " is not part of the Fibonacci sequence");
            }
            scanner.close();
        } catch(Exception e){
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}