/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;

/**
 * Clase que respresenta la equivalencia de una pagina pero en memoria fisica.
 */
public class Segmento {

    private int id;
    private int numero;
    private int tamanio;

    public Segmento(int i, int t, int n) {
        id = i;
        tamanio = t;
        numero  = n;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
