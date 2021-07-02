package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		
		this.voti = new ArrayList<>();
	}

	public void add(Voto voto) {
		
		this.voti.add(voto);
	}
	
	public String toString() {
		String s = "";
		for(Voto v:this.voti) {
			s = s + v.toString();
		}
		
		return s;
	}
}
