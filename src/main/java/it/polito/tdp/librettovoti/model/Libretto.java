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
	
	/**
	 * 
	 * @param punteggio
	 * @return
	 */
	public Libretto votiUguali(int punteggio) {
		
		Libretto risultato = new Libretto();
		for (Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	/**
	 * Ricerca il corso indicato dal parametro.
	 * nel caso non trova niente restituisce null
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato = null;
		
		for(Voto v:this.voti) {
			if(nomeCorso.equals(v.getNomeCorso())) {
				risultato = (v);
				break;
			}
		}
		
		return risultato;
	}
	
	public String toString() {
		String s = "";
		for(Voto v:this.voti) {
			s = s + v.toString();
		}
		
		return s;
	}
}
