package org.slsid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeEmployee;
	private String nomEmployee;
	
	
	@ManyToOne
	@JoinColumn(name = "CODE_EMP_SUP")
	private Employee empSup;
	@ManyToMany
	@JoinTable(name="EMP_GR")
	private Collection<Groupe> groupes;
	public Employee() {
		super();
	}
	public Employee(String nomEmployee) {
		super();
		this.nomEmployee = nomEmployee;
	}
	public Long getCodeEmployee() {
		return codeEmployee;
	}
	public void setCodeEmployee(Long codeEmployee) {
		this.codeEmployee = codeEmployee;
	}
	public String getNomEmployee() {
		return nomEmployee;
	}
	public void setNomEmployee(String nomEmployee) {
		this.nomEmployee = nomEmployee;
	}
	// Convertir l'object en json mais ne retourne pas empsup: warning : si on fait un post d'un nouveau employee avec son empsup l'empsup sera null 
	@JsonIgnore
	public Employee getEmpSup() {
		return empSup;
	}
	
	// json setter va regler le probleme de sauvgarde des employees 
	@JsonSetter
	public void setEmpSup(Employee empSup) {
		this.empSup = empSup;
	}
	@JsonIgnore
	public Collection<Groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}
	
}
