package state.ejercicio;

public class Apagado implements IStateComputer {

    @Override
    public void comportamientoComputadora(Computadora computadora) {
        System.out.println("---------------------------COMPUTADORA--------------------------");
        computadora.setCpu(1.0);
        computadora.setRam(1.0);
        System.out.println("LA COMPUTADORA ESTA APAGADA..................................................");
        computadora.show();
    }
    
}
