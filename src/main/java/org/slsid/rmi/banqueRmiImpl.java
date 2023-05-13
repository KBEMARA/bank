package org.slsid.rmi;

import org.slsid.entities.Compte;
import org.slsid.metier.CompteMetier;
import org.slsid.metier.OperationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.stereotype.Component;

@Component("myRmiService")
public class banqueRmiImpl implements banqueRmiRemote {
  /*  @Autowired
	private CompteMetier rmiCompteMetier;
    @Autowired
	private OperationMetier rmiOperationMetier;
	@Override
	public Compte saveCompte(Compte cp) throws RemoteAccessException {
		// TODO Auto-generated method stub
		return rmiCompteMetier.saveCompte(cp);
	}

	@Override
	public Compte getCompte(String code) throws RemoteAccessException {
		// TODO Auto-generated method stub
		return rmiCompteMetier.getCompte(code);
	}

	@Override
	public boolean verser(String code, double montant, Long codeEmp) throws RemoteAccessException {
		// TODO Auto-generated method stub
		return rmiOperationMetier.verser(code, montant, codeEmp);
	}

	@Override
	public boolean retirer(String code, double montant, Long codeEmp) throws RemoteAccessException {
		// TODO Auto-generated method stub
		return rmiOperationMetier.retirer(code, montant, codeEmp);
	}

	@Override
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) throws RemoteAccessException {
		// TODO Auto-generated method stub
		return rmiOperationMetier.retirer(cpte2, montant, codeEmp);
	}
*/
}
