package org.slsid.metier;

import java.util.List;

import org.slsid.entities.Client;

public interface ClientMetier {
	public Client saveClient(Client c);
	public List<Client> listClient();

}
