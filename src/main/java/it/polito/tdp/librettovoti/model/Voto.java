package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

// POJO - Plan Old Java Object
// Java Beans
// semplice contenitore di dati. Non ha logica.

/**
 * Memorizza il risultato di un singolo esame
 * 
 * @author renato.ventura
 *
 */
public class Voto {
	private String nomeCorso;
	private int voto;
	private boolean conLode;
	private LocalDate data;
	
	/**
	 * Costruttore
	 * 
	 * @param nomeCorso (String) - nome del corso superato
	 * @param voto (int) - voto ottenuto
	 * @param conLode (boolen) - se è con lode
	 * @param data (LocalDate) - data superamento esame
	 */
	public Voto(String nomeCorso, int voto, boolean conLode, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.conLode = conLode;
		this.data = data;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public boolean isConLode() {
		return conLode;
	}

	public void setConLode(boolean conLode) {
		this.conLode = conLode;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		if(this.conLode == false) {
			return "Esame " + nomeCorso + " con voto " + voto  + " superato in data " + data + "\n";
		} else {
			return "Esame " + nomeCorso + " con voto " + voto  + " con lode superato in data " + data + "\n";
		}
		
	}

	
}
