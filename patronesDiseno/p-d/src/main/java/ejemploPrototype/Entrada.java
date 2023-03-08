package ejemploPrototype;

public class Entrada implements IEntrada{

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Persona persona;
    private Stadium stadium;
    private String fecha;
    private String lugar;
    private String precio;
    private int numeroAsiento;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public String getPrecio() {
        return precio;
    }

    public Entrada(Stadium stadium, Equipo equipoLocal, Equipo equipoVisitante){
        this.stadium = stadium;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void show(){
        System.out.println("------");
        System.out.println(persona.getName()+" "+persona.getCi());
        System.out.println(stadium.getName());
        System.out.println(equipoLocal.getNombre());
        System.out.println(equipoVisitante.getNombre());
        System.out.println(precio);
        System.out.println(fecha);
        System.out.println("Asiento"+numeroAsiento);
        
    }

    @Override
    public Object clone(){

        Entrada clone= new Entrada(this.stadium, this.equipoLocal, this.equipoVisitante);
        clone.setFecha(this.fecha);
        clone.setLugar(this.lugar);
        clone.setNumeroAsiento(this.numeroAsiento);
        clone.setPrecio(this.precio);
        clone.setPersona(this.persona);
        return clone;
    }
}
