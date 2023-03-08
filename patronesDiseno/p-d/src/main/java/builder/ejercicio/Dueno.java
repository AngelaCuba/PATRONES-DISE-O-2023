package builder.ejercicio;

public class Dueno {
    private  BuilderComputadora builder;

    public Computadora getComputadora(){
        return builder.getComputadora();
    }

    public void setComputadora(BuilderComputadora builder){
        this.builder = builder;
    }

    public void buildComputadora(){
        this.builder.construirComputadora();
        this.builder.buildMemoria();
        this.builder.buildMonitor();
        this.builder.buildMouse();
        this.builder.buildProcesador();
        this.builder.buildTeclado();
        this.builder.buildVideo();
        this.builder.buildNombre();
    }
}
