package Client;

import Common.OperatorInterface;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientOperation {
    public static void main(String[] args) {
        float a = 10;
        float b = 2;
        try {
            Registry registry = LocateRegistry.getRegistry("172.20.10.3");
            OperatorInterface operator = (OperatorInterface)registry.lookup("operator");
            System.out.println(a + " + "+ b + " = " + operator.add(a,b));
            System.out.println(a + " - "+ b + " = " + operator.substrac(a,b));
            System.out.println(a + " * "+ b + " = " + operator.multiply(a,b));
            System.out.println(a + " / "+ b + " = " + operator.divide(a,b));
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
