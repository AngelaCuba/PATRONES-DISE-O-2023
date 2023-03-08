package memento.ejercicio;

public class Backup {
    private BaseDatos baseDatos;

    public void setBackup(BaseDatos backup){
        this.baseDatos = new BaseDatos();
        this.baseDatos.setPersonas(backup.getPersonas());
    }


    public Memento newBackup(String alias){
        return new Memento(this.baseDatos, alias);
    }

    public BaseDatos restoreBackup(Memento memento){
        this.baseDatos = new BaseDatos();
        this.baseDatos.setPersonas(memento.getBaseDatos().getPersonas());
        System.out.println("SE RESTAURO LA BASE DE DATOS: "+memento.getAlias());
        return this.baseDatos;
    }
}
