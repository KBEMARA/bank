package org.slsid.service;

import org.slsid.entities.Compte;
import org.slsid.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteRestService implements CompteMetier{
	
	@Autowired
	private CompteMetier compteMetier; 

	@RequestMapping(value="/comptes",method = RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte cp) {
		// TODO Auto-generated method stub
		return compteMetier.saveCompte(cp);
	}

	@RequestMapping(value="/comptes/{code}",method = RequestMethod.GET)
	public Compte getCompte(@PathVariable String code) {
		// TODO Auto-generated method stub
		return compteMetier.getCompte(code);
	}

}
