package builder.ejercicio;

public class Computadora {
    private String nombre;
    private String monitor;
    private String teclado;
    private String mouse;
    private String memoria;
    private String procesador;
    private String video;

    public String getMonitor() {
        return monitor;
    }
    public Computadora setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }
    public String getTeclado() {
        return teclado;
    }
    public Computadora setTeclado(String teclado) {
        this.teclado = teclado;
        return this;
    }
    public String getMouse() {
        return mouse;
    }
    public Computadora setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }
    public String getMemoria() {
        return memoria;
    }
    public Computadora setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }
    public String getProcesador() {
        return procesador;
    }
    public Computadora setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }
    public String getVideo() {
        return video;
    }
    public Computadora setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getNombre() {
        return nombre;
    }
    public Computadora setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void showInfo(){
        System.out.println(nombre+"--------------------------------------------------------");
        System.out.println("Monitor: "+monitor);
        System.out.println("Teclado: "+teclado);
        System.out.println("Mouse: "+mouse);
        System.out.println("Memoria: "+memoria);
        System.out.println("Procesador: "+procesador);
        System.out.println("Video: "+video);
    }
    
    
}
