package org.slsid.metier;

import java.util.List;

import org.slsid.dao.ClientRepository;
import org.slsid.dao.EmployeeRepository;
import org.slsid.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// @Service utiliser pour les object de la couche metiers
@Service
public class ClientMetierImpl implements ClientMetier {
	@Autowired
    private ClientRepository clientRepository;
	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
