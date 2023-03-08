package state.ejercicio;

public class Reiniciando implements IStateComputer {
    @Override
    public void comportamientoComputadora(Computadora computadora) {
        System.out.println("---------------------------COMPUTADORA--------------------------");
        computadora.show();
        computadora.setCpu(0.0);
        computadora.setRam(0.0);
        System.out.println("LA COMPUTADORA SE ESTA REINICIANDO.............................................................................");
        while(!computadora.getProgramas().empty()){
            computadora.quitarPrograma();
        }
        computadora.show();
    }
}
