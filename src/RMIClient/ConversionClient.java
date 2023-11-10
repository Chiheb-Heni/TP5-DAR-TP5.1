package RMIClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiService.IConversion;

public class ConversionClient {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        // Look up the remote object in the RMI registry using its assigned name
        IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/objetdistant");

        // Call the conversion method on the remote object and print the result
        System.out.println("Conversion result: " + stub.conversion(700.00));
    }
}