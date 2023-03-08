package builder.ejercicio;

public class ComputadoraI5 extends BuilderComputadora {
    @Override
    public void buildNombre() {
        this.computadora.setNombre("I5-Bajo");
        
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("8gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("24");
        
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("normal");
        
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i5");
        
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("normal");
        
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("4");
        
    }
}
