import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Sistema sistem = new Sistema();
        sistem.ejecucion();

        boolean salir = false;   
        

        //MENU xd
        do{
            int op= 0;
            
            System.out.println("");
            System.out.println("-------- Menú ---------");
            System.out.println("Elija un tipo de fragmentacion");
            System.out.println("1. Fragmentación interna");
            System.out.println("2. Fragmentación externa");
            System.out.println("0. Salir");
            System.out.println("");
            
            Scanner teclado = new Scanner(System.in);
            op = teclado.nextInt();
            
            switch(op) {
            case 1:
            //SACAR PRINT Y PONER LA FUNCION CORRESPONDIENTE
                System.out.println("Funcion de fragmentación interna");
              break;
            case 2:
            //SACAR PRINT Y PONER LA FUNCION CORRESPONDIENTE
                System.out.println("Funcion de fragmentación externa");
              break;
            default:
                salir = true;
            }
        }
        while(!salir);
    }
}
