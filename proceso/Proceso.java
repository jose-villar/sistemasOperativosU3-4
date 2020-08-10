package proceso;

import java.util.ArrayList;
import memoria.Segmento;

public class Proceso {

    private String etiqueta;
    private int id;
    private int tamanio;
    private int tiempo_computo;
    private boolean estado;
    private static final int DEFAULT_INITIAL_PRIORITY = 1;
    private int prioridad;
    private ArrayList<Segmento> segmentos;
    
    /**
     * Constructor del proceso sin prioridad
     * @param pid id del proceso
     * @param e etiqueta o nombre del proceso
     * @param t tamanio del proceso en mb
     * @param tc tiempo de computo necesario para que el proceso se ejecute
     */
    public Proceso(int pid, String e, int t, int tc) {
        id = pid;
        etiqueta = e;
        tamanio = t;
        tiempo_computo = tc;
        estado = true;
        prioridad = DEFAULT_INITIAL_PRIORITY;
        segmentos = new ArrayList<>();
    }
    /**
     * Constructor del proceso con prioridad
     *@param pid id del proceso
     * @param e etiqueta o nombre del proceso
     * @param t tamanio del proceso en mb
     * @param tc tiempo de computo necesario para que el proceso se ejecute
     * @param prio prioridad del proceso (0 maxima - 1 minima)
     */
    public Proceso(int pid, String e, int t, int tc, int prio) {
        id = pid;
        etiqueta = e;
        tamanio = t;
        tiempo_computo = tc;
        estado = true;
        prioridad = prio;
        segmentos = new ArrayList<>();
    }
    /**
     * disminuye el tiempo de computo del proceso
     * @param tiempoCumplido tiempo disminuido
     */
    public void disminuirComputo(int tiempoCumplido) {
        if (getTiempo_computo() > 0) {
            setTiempo_computo(getTiempo_computo() - tiempoCumplido);
        } else
            System.out.println("Proceso/ Tiempo cumplido");
    }

    public void segmentarProceso(){
        
        int tamanioSeg, tamanioSegAux;
        int tamanioRestante=getTamanio();
        int numeroSeg = 1;
        while (tamanioRestante>0){
            tamanioSegAux = getTamanioSeg();
            if(tamanioSegAux<=tamanioRestante){
                tamanioSeg = tamanioSegAux;
            }
            else{
                tamanioSeg = tamanioRestante;
            }
            System.out.println(getEtiqueta()+ " creando segmento "+numeroSeg+" de " +tamanioSeg);
            tamanioRestante = tamanioRestante - tamanioSeg;
            addSegmento(new Segmento(getId(),tamanioSeg,numeroSeg));
            numeroSeg++;
        }
    }
    private void addSegmento(Segmento s){
        segmentos.add(s);
    }
    private int getTamanioSeg(){
      return (int)(Math.random()*1000+100);
    }
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTiempo_computo() {
        return tiempo_computo;
    }

    public void setTiempo_computo(int tiempo_computo) {
        this.tiempo_computo = tiempo_computo;
    }

    public boolean isActivo() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Segmento> getSegmentos() {
      return this.segmentos;
    }
    
}
