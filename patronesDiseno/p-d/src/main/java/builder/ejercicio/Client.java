package builder.ejercicio;

public class Client {
    public static void main(String[] args) {
        Dueno dueno = new Dueno();
        ComputadoraI9 alto = new ComputadoraI9();
        ComputadoraI7 medio = new ComputadoraI7();
        ComputadoraI5 bajo = new ComputadoraI5();

        dueno.setComputadora(alto);
        dueno.buildComputadora();

        Computadora compu1 = dueno.getComputadora();

        dueno.setComputadora(medio);
        dueno.buildComputadora();

        Computadora compu2 = dueno.getComputadora();

        dueno.setComputadora(bajo);
        dueno.buildComputadora();

        Computadora compu3 = dueno.getComputadora();

        compu1.showInfo();
        compu2.showInfo();
        compu3.showInfo();
    }
}
