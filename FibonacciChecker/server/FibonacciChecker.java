package FibonacciChecker.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FibonacciChecker extends Remote{
    public boolean isPerfectSquare(int n) throws RemoteException;
    public boolean isFibonacci(int n) throws RemoteException;
    public int getFibonacciPosition(int n) throws RemoteException;
}
