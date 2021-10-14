package Client;

import Common.HelloUserInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientHelloUser  {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry();
        HelloUserInterface remoteObj = (HelloUserInterface)registry.lookup("Hello");
        System.out.println(remoteObj.hello_user("Patata"));
    }
}
