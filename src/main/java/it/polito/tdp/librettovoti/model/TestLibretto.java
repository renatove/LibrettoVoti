package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	
	public static void main(String[] args) {
		
		Libretto libretto = new Libretto();
		
		System.out.println("Fase di test della classe Libretto");
		libretto.add(new Voto("Analisi 1", 30, true, LocalDate.of(2019, 1, 12)));
		libretto.add(new Voto("Analisi 2", 28, false, LocalDate.of(2019, 5, 11)));
		libretto.add(new Voto("Fisica 1", 30, false, LocalDate.of(2019, 6, 12)));
		libretto.add(new Voto("Fisica 2", 30, true, LocalDate.of(2019, 1, 12)));
		libretto.add(new Voto("Laboratorio 1", 29, false, LocalDate.of(2020, 2, 19)));
		libretto.add(new Voto("Laboratorio 2", 25, false, LocalDate.of(2020, 6, 30)));
		libretto.add(new Voto("Informatica 1", 30, true, LocalDate.of(2020, 11, 12)));
		libretto.add(new Voto("Informatica 2", 30, true, LocalDate.of(2021, 1, 9)));
		libretto.add(new Voto("Geometria 1", 25, false, LocalDate.of(2021, 5, 22)));
		libretto.add(new Voto("Chimica 1", 30, true, LocalDate.of(2021, 6, 12)));		
	
		System.out.println(libretto);
		
		Libretto libretto25 = libretto.votiUguali(25);
		System.out.println(libretto25);
		
	}


	
	
}
