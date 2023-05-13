package org.slsid.rmi;

import java.rmi.Remote;

import org.slsid.entities.Compte;
import org.springframework.remoting.RemoteAccessException;

public interface banqueRmiRemote extends Remote {
	/*public Compte saveCompte(Compte cp) throws RemoteAccessException;
	public Compte getCompte(String code) throws RemoteAccessException;
	public boolean verser(String code, double montant, Long codeEmp) throws RemoteAccessException;
	public boolean retirer(String code, double montant, Long codeEmp)throws RemoteAccessException;
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) throws RemoteAccessException;*/
}
