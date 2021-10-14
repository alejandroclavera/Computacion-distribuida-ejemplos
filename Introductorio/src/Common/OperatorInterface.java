package Common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OperatorInterface extends Remote {
    public float add(float a, float b) throws RemoteException;
    public float substrac(float a, float b) throws RemoteException;
    public float multiply(float a, float b) throws RemoteException;
    public float divide(float a, float b) throws RemoteException;
}
