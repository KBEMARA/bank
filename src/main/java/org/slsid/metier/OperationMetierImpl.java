package org.slsid.metier;

import java.util.Date;



import org.slsid.dao.CompteRepository;
import org.slsid.dao.EmployeeRepository;
import org.slsid.dao.OperationRepository;
import org.slsid.entities.Compte;
import org.slsid.entities.Employee;
import org.slsid.entities.Operation;
import org.slsid.entities.Viressement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OperationMetierImpl implements OperationMetier{
    
	@Autowired
	private OperationRepository operationRepository;
	
	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	@Transactional
	public boolean verser(String code, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		Compte cp = compteRepository.getOne(code);
		Employee e = empRepository.getOne(codeEmp);
		Operation o = new Viressement();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setEmployee(e);
		o.setCompte(cp);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde() + montant);
		return true;
	}

	@Override
	@Transactional
	public boolean retirer(String code, double montant, Long codeEmp) {
		Compte cp = compteRepository.getOne(code);
		if(cp.getSolde() < montant) throw new RuntimeException("solde insuffissant");
		Employee e = empRepository.getOne(codeEmp);
		Operation o = new Viressement();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setEmployee(e);
		o.setCompte(cp);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde() - montant);
		return true;
	}

	@Override
	@Transactional
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) {
		retirer(cpte1, montant, codeEmp);
		verser(cpte2, montant, codeEmp);
		return true;
	}

	@Override
	public pageOperation getOperation(String codeCompte, int page, int size) {
		Page<Operation> ops = operationRepository.getOperations(codeCompte, PageRequest.of(page, size));
		
		// seconde méthode
		/*Compte cp = compteRepository.getOne(codeCompte);
		Page<Operation> ops2 = operationRepository.findByCompte(null, null)*/
		pageOperation pOp = new pageOperation();
		pOp.setOperations(ops.getContent());
		pOp.setNombreOperations(ops.getNumberOfElements());
		pOp.setPage(ops.getNumber());
		pOp.setTotalOperations(ops.getTotalPages());
		pOp.setTotalOperations((int)ops.getTotalElements());
		return pOp;
	}

}
