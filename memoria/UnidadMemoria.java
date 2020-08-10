/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;

import java.util.ArrayList;
import memoria.Segmento;
import proceso.Proceso;

public class UnidadMemoria {

    private ArrayList<Integer> memoria = new ArrayList<>();
   
    private ArrayList<Proceso> procesos;
    
    
    private int tamanio;
    private int tamanio_libre;
    
    
    public UnidadMemoria(int t){
        procesos = new ArrayList<>();
        
        tamanio = t;
        tamanio_libre = tamanio;
    }
    /*public boolean addProceso(Proceso p) {
        if (p.getTamanio() <= getTamanio_libre()) {
            procesos.add(p);
            setTamanio_libre(getTamanio_libre() - p.getTamanio());
            System.out.println(p.getEtiqueta()+" pid: "+p.getId() + " agregado");
            System.out.println("Memoria restante: " + getTamanio_libre() + "MB");
            return true;
        } else {
            return false;
        }
    }*/
    public boolean addProceso(Proceso p){
        return true;
    }
    public boolean quitarProceso(Proceso p) {
        if (procesos.remove(p)) {
            setTamanio_libre(getTamanio_libre() + p.getTamanio());
            System.out.println(p.getTamanio() + "MB de espacio liberado");
            System.out.println("Memoria libre: " + getTamanio_libre() + "MB");
            return true;
        } else {
            System.out.println("No se encontró proceso");
            return false;
        }
    }
    public boolean isInMemoria(Proceso p) {
        return procesos.contains(p);
    }

    public boolean hayMemoriaPara(int t) {
        if (tamanio_libre >= t)
            return true;
        else
            return false;
    }
    
    
    //Rellenando la memoria con ceros
    public void crearMemoria(){
        for(int i=0; i<6000;i++){
            memoria.add(0);
        }
    }

    
    public void fragmentacion(Segmento seg){
        int tamanio = seg.getTamanio();
        int id = seg.getPid();
        int posicion;
        
        sacarVacios();
        posicion = posicionVacio(tamanio);
        
        for(int i=0; i<tamanio; i++){
            memoria.add(id);
            System.out.println("El segmento id "+id+ " se almaceno en el espacio "+posicion+" de memoria");
        }
 
    }
    
    
    //Busca una posicion vacia en el arreglo
    //en la que se pueda poner el segmento de
    //un tamaño tamanio
    public int posicionVacio(int tamanio){
        int count = 0;
        int pos=0;
        
        for(int i=0; i<memoria.size(); i++){
            
            if(count==tamanio){
                break;
            }
            
            if(memoria.get(i).equals(0)){
                count+=1;
            }
            pos+=1;
        }
        pos = pos-count;

        return pos;
    }
    
    
    //Se recorre el arreglo de la memoria
    //se buscan todos los valores que no sean vacios
    //y se dejan esos valores en un arreglo auxiliar,
    //luego se vacia la memoria y se rellena con los valores
    //del arreglo auxiliar.
    public void sacarVacios(){
        ArrayList<Integer> aux = new ArrayList<>();
        
        for(int i=0; i<memoria.size();i++){
            if(memoria.get(i)!=0){
                aux.add(memoria.get(i));
            }
        }
        memoria.clear();
        
        for(int i=0; i<aux.size(); i++){
            memoria.add(aux.get(i));
        }
        aux.clear();
    }
        
    
    public ArrayList<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(ArrayList<Proceso> procesos) {
        this.procesos = procesos;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTamanio_libre() {
        return tamanio_libre;
    }

    public void setTamanio_libre(int tamanio_libre) {
        this.tamanio_libre = tamanio_libre;
    }
    
    
}
