package builder.ejercicio;

public class ComputadoraI9 extends BuilderComputadora {

    

    @Override
    public void buildNombre() {
        this.computadora.setNombre("I9-Alto");
        
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("32gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("45");
        
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("gamer");
        
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i9");
        
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("luminos");
        
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("16");
        
    }
    
}
