package mmu;

/**
 * Clase que representa la unidad de gestión de memoria, que traduce la direccion lógica a una direccion fisica usando una tabla de segmentación.
 Tansforma el segmento + offset en una dirección física
 o devuelve segmentation fault si se pasa del limite
 
 */
public class MMU {

  // Tiene la tabla de segmentos


  //método que recibe una dirección lógica que tiene un id de segmento y un offset. Busca en la tabla el segmento buscado y verifica si el offset es mayor que el límite que sale en la tabla. De ser así, retorna segmentation fault. En caso contraio, devuelve la dirección de memoria física que va a utilizar el segmento

}
