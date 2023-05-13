package org.slsid.dao;


import org.slsid.entities.Compte;
import org.slsid.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OperationRepository extends JpaRepository<Operation, Long>{
	@Query("select o from Operation o where o.compte.codeCompte=:x")
	public Page<Operation> getOperations(@Param("x") String code,Pageable pageable );
	
	// Si vous ne voulez pas utiliser la @Query ajouter la methode pour la deuxième solution 
	
	//public Page<Operation> findByCompte(Compte cp, Pageable pageable);

}
