package FibonacciChecker.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FibonacciCheckerImpl extends UnicastRemoteObject implements FibonacciChecker{
    protected FibonacciCheckerImpl() throws RemoteException {
        super();
    }
    @Override
    public boolean isPerfectSquare(int n) throws RemoteException {
        int x = (int) Math.sqrt(n);
        return (x * x == n);
    }
    @Override
    public boolean isFibonacci(int n) throws RemoteException {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }
    @Override
    public int getFibonacciPosition(int n) throws RemoteException {
        if (isFibonacci(n)) {
            int a = 0, b = 1, c = 1;
            int i = 1;
            while (c != n) {
                c = a + b;
                a = b;
                b = c;
                i++;
            }
            return i;
        }
        return -1;
    }
}
