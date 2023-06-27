package FibonacciChecker.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FibonacciChecker extends Remote{
    boolean isPerfectSquare(int n) throws RemoteException;
    boolean isFibonacci(int n) throws RemoteException;
    int getFibonacciPosition(int n) throws RemoteException;
}
