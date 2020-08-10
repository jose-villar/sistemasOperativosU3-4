package mmu;

/* 
Tabla de segmentos:
ID|Base|Limite

La base es donde comienza en la memoria principal
y el límite es donde termina en la memoria principal
*/



public class TablaSegmentos {

  private Proceso proceso;
  private UnidadMemoria ram;

  //fila: ID|Base|Límite

  public TablaSegmentos(Proceso proceso, UnidadMemoria ram) {

    int[] fila;
    int nSegmentos = proceso.getSegmentos().size();
    int[][] tabla;

    for(int i = 0; i < nSegmentos; i++ ) {
      
    }


  }


  public void construirTabla() {
    int[] fila = {0, 0, 100};



  }




}
