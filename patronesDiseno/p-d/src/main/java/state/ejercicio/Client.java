package state.ejercicio;

public class Client {
    public static void main(String[] args) {
        Computadora pc = new Computadora();

        pc.useComputer();

        pc.setStateComputer(new Reiniciando());
        pc.useComputer();

        pc.setStateComputer(new Prendido());
        pc.useComputer();

        pc.setStateComputer(new Reiniciando());
        pc.useComputer();
    }
}
