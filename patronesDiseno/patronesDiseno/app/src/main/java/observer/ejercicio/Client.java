package observer.ejercicio;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Telefonia tel = new Telefonia();

        Usuario pedro = new Usuario().setNombre("pedro").setCi("123");
        Usuario maria = new Usuario().setNombre("maria").setCi("1234");
        Usuario eynar = new Usuario().setNombre("eynar").setCi("1232");

        tel.suscribirPropaganda(pedro, List.of("premios"));
        tel.suscribirPropaganda(pedro, List.of("promociones"));

        tel.suscribirPropaganda(maria, List.of("noticias") );

        tel.suscribirPropaganda(eynar, List.of("precios llamadas", "promociones", "premios", "noticias") );

        tel.notificar("BUENOS DIAS", "premios");
        tel.notificar("BUENOS DIAS", "promociones");
        tel.notificar("BUENOS DIAS", "precios llamadas");
        tel.notificar("BUENOS DIAS", "noticias");


    }
}
