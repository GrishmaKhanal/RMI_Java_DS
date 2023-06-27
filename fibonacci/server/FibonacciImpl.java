package fibonacci.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class FibonacciImpl extends UnicastRemoteObject implements Fibonacci{
    protected FibonacciImpl() throws RemoteException {
        super();
    }
    @Override
    public int fib(int n) throws RemoteException {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
