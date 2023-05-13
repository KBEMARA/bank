package org.slsid.metier;

import org.slsid.entities.Compte;

public interface CompteMetier {

	public Compte saveCompte(Compte cp);
	public Compte getCompte(String code);
}
