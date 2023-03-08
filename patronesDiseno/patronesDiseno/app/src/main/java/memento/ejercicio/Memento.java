package memento.ejercicio;

public class Memento {
    private BaseDatos baseDatos;
    private String alias;

    public Memento(BaseDatos baseDatos, String alias){
        this.baseDatos = baseDatos;
        this.alias = alias;
    }

    public BaseDatos getBaseDatos() {
        return baseDatos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    

    
}
