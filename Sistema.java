import cpu.Planificador;

public class Sistema {

    private Planificador cpuPlan;
    private int tipoFragmentacion;

    public Sistema(int tipoFrag) throws InterruptedException {
        tipoFragmentacion = tipoFrag;
        cpuPlan = new Planificador();

    }

    void ejecucion() throws InterruptedException {
        System.out.println("\n===========Inicio ejecucion de procesos============");
        cpuPlan.ejecucion();
    }
}
