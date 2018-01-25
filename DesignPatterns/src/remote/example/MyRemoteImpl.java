package remote.example;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


/**
 * NOTE - for these examples, you need to move these out, install them using javac after removing the package annotation.
 * This Example is funcitonal, I just really fucking hate seeing broken packages on my nice clean Design Patterns
 * @author falch_000
 *
 */

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	
	private static final long serialVersionUID = 1L;

	public MyRemoteImpl() throws RemoteException{};
	
	public String sayHello() {
		return "Server says, 'Heyyyyyy sweet boy'"; 
	}
	
	public static void main (String args[]){
		System.out.println("Starting up MyRemoteImplementation");
		try{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch(Exception ex){}
	}
	
}
