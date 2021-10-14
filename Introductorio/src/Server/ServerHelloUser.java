package Server;

import Common.HelloUserInterface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerHelloUser implements HelloUserInterface {

    @Override
    public String hello_user(String username) throws RemoteException {
        return "Hello " + username;
    }

    public static void main(String[] args) {
       try {
           ServerHelloUser obj = new ServerHelloUser();
           HelloUserInterface remoteObj = (HelloUserInterface) UnicastRemoteObject.exportObject(obj, 0);
           Registry localRegistry = LocateRegistry.getRegistry();
           localRegistry.bind("Hello", remoteObj);
           System.out.println("Server is ready");
       } catch (Exception e){}
    }
}
