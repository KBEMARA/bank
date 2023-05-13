package org.slsid.service;

import java.util.List;

import org.slsid.entities.Client;
import org.slsid.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestService {
	
	@Autowired
	private ClientMetier clientMetier;
    
	// post: ajouter put: mise à jour 
	// au niveau de paramtre client on ajopute @RequestBody pour desirialiser en format Json
	// @ResponseBody  pour que le resultat il va le serialiser dans le corps de la reponse
	@RequestMapping(value="/clients", method = RequestMethod.POST)
	public Client saveClient(@RequestBody Client c) {
		return clientMetier.saveClient(c);
	}
    
	@RequestMapping(value="/clients", method = RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}

}
