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

    private int pid;//id proceso
    private int numero;//identificador del segmento
    private int tamanio;//tamanio del segmento

    public Segmento(int i, int t, int n) {
        pid = i;
        tamanio = t;
        numero  = n;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
