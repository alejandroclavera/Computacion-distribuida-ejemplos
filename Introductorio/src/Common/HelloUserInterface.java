package Common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloUserInterface extends Remote {
    String hello_user(String username) throws RemoteException;
}
