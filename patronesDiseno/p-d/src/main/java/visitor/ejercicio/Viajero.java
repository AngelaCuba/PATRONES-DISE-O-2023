package visitor.ejercicio;

public class Viajero implements ILibreCambista{

    private double montoACambiar;

    @Override
    public void visitar(USA usa) {
        System.out.println("---------------------CAMBIANDO DOLARES-----------------------");
        System.out.println(montoACambiar+" USD equivale a: ");
        System.out.println(usa.cambiarABol(montoACambiar)+" BS");
        System.out.println(usa.cambiarAEu(montoACambiar)+" E");
    }

    @Override
    public void visitar(EU eu) {
        System.out.println("---------------------CAMBIANDO EUROS-----------------------");
        System.out.println(montoACambiar+" E equivale a: ");
        System.out.println(eu.cambiarABol(montoACambiar)+" BS");
        System.out.println(eu.cambiarADol(montoACambiar)+" USD");
    }

    @Override
    public void visitar(Bol bol) {
        System.out.println("---------------------CAMBIANDO BOLIVIANOS-----------------------");
        System.out.println(montoACambiar+" BS equivale a: ");
        System.out.println(bol.cambiarADol(montoACambiar)+" USD");
        System.out.println(bol.cambiarAEu(montoACambiar)+" E");
        
    }

    public double getMontoACambiar() {
        return montoACambiar;
    }

    public void setMontoACambiar(double montoACambiar) {
        this.montoACambiar = montoACambiar;
    }

    
    
}
