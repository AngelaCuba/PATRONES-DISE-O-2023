package ejercicioPrototype;

public class Celular implements ICelular{
    private String marca;
    private String modelo;
    private String tamano;
    private int cpu;
    private String memory;
    private Sim sim;
    private String versionAndroid;
    private int camara;
    private boolean bluetooth;
    private int cantidadDeMemoriasExternas;
    private String tiempoUsoBateria;
    private Accesorios accesorios;


    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public Celular(String marca, String modelo, String tamano, int cpu, String memory, String versionAndroid, int camara, boolean bluetooth, int cantidadDeMemoriasExternas
    , String tiempoUsoBateria, Accesorios accesorios){
        this.marca = marca;
        this.modelo = modelo;
        this.tamano = tamano;
        this.cpu = cpu;
        this.memory=memory;
        this.versionAndroid=versionAndroid;
        this.camara=camara;
        this.bluetooth=bluetooth;
        this.cantidadDeMemoriasExternas=cantidadDeMemoriasExternas;
        this.tiempoUsoBateria=tiempoUsoBateria;
        this.accesorios=accesorios;
    }

    @Override
    public Object clone(){
        Celular clone = new Celular(this.marca, this.modelo, this.tamano, this.cpu, this.memory,this.versionAndroid, this.camara, this.bluetooth, this.cantidadDeMemoriasExternas
        ,this.tiempoUsoBateria, this.accesorios);
        clone.setSim(this.sim);
        return clone;
    }

    public void show(){
        System.out.println("-------------------------------------------------");
        System.out.println(marca+" "+modelo);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Numero de procesadores: "+cpu);
        System.out.println("Memoria: "+memory);
        System.out.println("Version Android: "+versionAndroid);
        System.out.println("Bluetooth: "+(bluetooth ? "Si" : "No"));
        System.out.println("Cantidad de memorias externas: "+cantidadDeMemoriasExternas);
        System.out.println("Tiempo de Uso de Batería: "+tiempoUsoBateria);
        System.out.println("Accesorios: ");
        accesorios.show();
        System.out.println("Sim: "+sim.getNombreEmpresaTel()+" "+sim.getNumeroTelefono());
    }
}
