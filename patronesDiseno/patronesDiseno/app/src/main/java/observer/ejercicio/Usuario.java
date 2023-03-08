package observer.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements IUsuario{
    private String nombre;
    private String ci;
    private List<String> categorias = new ArrayList<>();

    

    public String getNombre() {
        return nombre;
    }
    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public List<String> getCategorias() {
        return categorias;
    }
    public Usuario setCategorias(List<String> categorias) {
        this.categorias = categorias;
        return this;
    }
    @Override
    public void addCategoria(String categoria) {
        if(!categorias.contains(categoria))
            categorias.add(categoria);
    }


    
    @Override
    public void quitarCategoria(String categoria) {
        categorias.remove(categoria);
    }
    @Override
    public void update(String propaganda, String categoria) {
        System.out.println("-----------------------------NUEVA PROPAGANDA :)----------------------------------------");
        System.out.println("USUARIO: "+nombre);
        System.out.println("CATEGORIA: "+categoria);
        System.out.println(propaganda);
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    public String getCi() {
        return ci;
    }
    public Usuario setCi(String ci) {
        this.ci = ci;
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((ci == null) ? 0 : ci.hashCode());
        result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (ci == null) {
            if (other.ci != null)
                return false;
        } else if (!ci.equals(other.ci))
            return false;
        if (categorias == null) {
            if (other.categorias != null)
                return false;
        } else if (!categorias.equals(other.categorias))
            return false;
        return true;
    }

    
}
