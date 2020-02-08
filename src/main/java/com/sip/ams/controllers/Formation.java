package com.sip.ams.controllers;



public class Formation {
	
	private int idFormation;
	private String libelleFormation;
	private String nmbreHeures;
	private String language;
	
	public Formation() {
		
	}
	

	public Formation(int idFormation, String libelleFormation
							, String nmbreHeures, String language) {

		this.idFormation = idFormation;
		this.libelleFormation = libelleFormation;
		this.nmbreHeures = nmbreHeures;
		this.language = language;
	}




	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}

	public String getLibelleFormation() {
		return libelleFormation;
	}

	public void setLibelleFormation(String libelleFormation) {
		this.libelleFormation = libelleFormation;
	}

	public String getNmbreHeures() {
		return nmbreHeures;
	}

	public void setNmbreHeures(String nmbreHeures) {
		this.nmbreHeures = nmbreHeures;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	

}
