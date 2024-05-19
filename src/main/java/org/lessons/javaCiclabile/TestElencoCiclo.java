package org.lessons.javaCiclabile;

public class TestElencoCiclo {

    public static void main(String[] args) {
	
	
	//con il costruttore che prende l'array
	
	int[] numeri = {1,2,3,4,5,6,7};
	ElencoCiclo elenco = new ElencoCiclo(numeri);
	
	System.out.println("Test con il costruttore che prende un array: ");
	for (int i = 0; i < numeri.length; i++) {
	    if (elenco.hasAncoraElementi(i)); {
		System.out.println("Indice: " + i + ", Valore: " + elenco.getElementoSuccessivo(i));
	    }
	}
	
	//aggiungo elementi con il costruttore senza parametri
	ElencoCiclo elencoVuoto = new ElencoCiclo();
	
	elencoVuoto.addElemento(10);
	elencoVuoto.addElemento(15);
	elencoVuoto.addElemento(30);
	elencoVuoto.addElemento(35);
	
	System.out.println("Test con il costruttore senza parametri utilizzo addElemento");
	for (int i = 0; i < elencoVuoto.getNumeroElementi(); i++) {
	    if (elencoVuoto.hasAncoraElementi(i)) {
		System.out.println("Indice: " + i + ", Valore: " + elenco.getElementoSuccessivo(i));
	    }
	}
    }

}
