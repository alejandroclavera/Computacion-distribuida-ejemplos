package Server;

import Common.OperatorInterface;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerOperator extends UnicastRemoteObject implements OperatorInterface {
    protected ServerOperator() throws RemoteException {
        super();
    }

    @Override
    public float add(float a, float b) throws RemoteException {
        return a + b;
    }

    @Override
    public float substrac(float a, float b) throws RemoteException {
        return a - b;
    }

    @Override
    public float multiply(float a, float b) throws RemoteException {
        return a * b;
    }

    @Override
    public float divide(float a, float b) throws RemoteException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            OperatorInterface operation = new ServerOperator();
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("operator", operation);
            System.err.println("Server is ready");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
