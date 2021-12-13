package com.family.demo.log4j;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author yangsaixing
 * @version v1.0
 * @description
 * @date 2021-12-13
 */
public class RMIServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(9002);
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("create rmi registry on port 9002");

            Reference reference=new Reference("RMIClient","RMIClient",null);

            ReferenceWrapper referenceWrapper=new ReferenceWrapper(reference);
            registry.bind("test",referenceWrapper);
        } catch (RemoteException | NamingException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
