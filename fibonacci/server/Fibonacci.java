package fibonacci.server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Fibonacci extends Remote{
    int fib(int n) throws RemoteException;
}
