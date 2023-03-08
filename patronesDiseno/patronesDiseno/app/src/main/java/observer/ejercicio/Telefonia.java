package observer.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Telefonia implements ITelefonia{

    private List<IUsuario> usuarios = new ArrayList<>();

    @Override
    public void notificar(String propaganda, String categoria) {
        usuarios.stream().filter(j -> j.getCategorias().contains(categoria)).forEach(j -> j.update(propaganda, categoria));
    }

    @Override
    public void quitarSuscripcion(IUsuario usuario, String categoria) {
        usuario.quitarCategoria(categoria);
    }

    @Override
    public void suscribirPropaganda(IUsuario usuario, List<String> categorias) {
        if(!usuarios.contains(usuario)){
            for(String aux : categorias){
                usuario.addCategoria(aux);
            }
            usuarios.add(usuario);
        } else{
            usuarios.stream().filter(j -> usuario.equals(j)).forEach(j -> categorias.stream().forEach(i -> j.addCategoria(i)));;
        }
    }
    
}
