package org.lessons.javaCiclabile;

public class ElencoCiclo {

    private int[] elementi;
    private int numeroElementi;
    
    public int getNumeroElementi() {
	return numeroElementi;
    }
    
    //costruttore che prende array di interi
    public ElencoCiclo(int[] elementi) {
	this.elementi = elementi;
	this.numeroElementi = elementi.length;
    }
    
    //costruttore senza parametri
    public ElencoCiclo() {
	this.elementi = new int[15];
	this.numeroElementi = 0;
    }
    
    //metodo che restituisce l'elemento successivo
    public int getElementoSuccessivo(int indiceCorrente) {
	if (indiceCorrente < numeroElementi) {
	    return elementi[indiceCorrente];
	}
	//Alessio qua continuava a darmi errore perciò ho seguito il suggerimeto
	//ma non mi è chiaro perche devo riscrivere return indiceCorrente due volte
	//avrei voluto inserire un messaggio ma mi da errore.
	return indiceCorrente; 
    }
    
    //metodo per verificare se ci sono ancora elementi ramite booleano
    public boolean hasAncoraElementi(int indiceCorrente) {
	return indiceCorrente < numeroElementi;
    }
    
    //faccio un metodo per espandere l'array quando necessario
    //non voglio che altri possano modificare come si espande percio 
    //lo mantengo interno alla classe
    private void espandiArray() {
	int[] nuovoArray = new int[elementi.length * 2];
	System.arraycopy(elementi, 0, nuovoArray, 0, elementi.length);
	elementi = nuovoArray;
    }
    
    //metodo per aggiungere nuovi elementi
    public void addElemento(int elemento) {
	if (numeroElementi == elementi.length) { 
	    espandiArray();
    }
  
    elementi[numeroElementi++] = elemento;
    
  } 
    
}
