package org.slsid.metier;

public interface OperationMetier {
	
	public boolean verser(String code, double montant, Long codeEmp);
	public boolean retirer(String code, double montant, Long codeEmp);
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp);
	public pageOperation getOperation(String codeCompte, int page, int size);

}
