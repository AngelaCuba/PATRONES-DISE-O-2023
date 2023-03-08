package builder.ejercicio;

public class ComputadoraI7 extends BuilderComputadora {
    @Override
    public void buildNombre() {
        this.computadora.setNombre("I7-Medio");
        
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("16gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("32");
        
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("luminos");
        
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i7");
        
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("luminos");
        
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("8");
        
    }
}
