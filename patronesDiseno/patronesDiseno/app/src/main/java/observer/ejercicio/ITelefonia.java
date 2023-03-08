package observer.ejercicio;

import java.util.List;

public interface ITelefonia {
    void suscribirPropaganda(IUsuario usuario, List<String> categorias);
    void quitarSuscripcion(IUsuario usuario, String categoria);
    void notificar(String propaganda, String categoria);
}
