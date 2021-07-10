package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	private CorsoDAO corsoDAO;
	
	public Model() {
		this.corsoDAO = new CorsoDAO();
	}
	
	public List<Corso> getCorsiPerPeriodo(Integer pd) {
		
		return corsoDAO.getCorsiPerPeriodo(pd);
		
	}
	
	public Map<Corso, Integer> getIscrittiPerPeriodo(Integer pd) {
		return corsoDAO.getIscrittiPerPeriodo(pd);
	}
}
