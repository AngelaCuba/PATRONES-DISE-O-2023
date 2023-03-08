package chainOfResponsability.ejercicio;

public class Client {
    public static void main(String[] args) {
        ServicioAlCliente servicio = new ServicioAlCliente();

    servicio.reportarProblema(new Falla("Hola Mundo", "BAJA", "No aparece nada en la terminal"));
    servicio.reportarProblema(new Falla("Hola Mundo", "MEDIA", "No aparece nada en la terminal"));
    servicio.reportarProblema(new Falla("Hola Mundo", "ALTA", "No aparece nada en la terminal"));
    servicio.reportarProblema(new Falla("Hola Mundo", "CRITICA", "No aparece nada en la terminal"));
    }
}
