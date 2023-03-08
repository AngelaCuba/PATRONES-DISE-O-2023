package primerParcialFilaB.ejercicio1Singleton;

public class Tesis {
    private String titulo;
    private String mencion;
    private Estudiante estudiante;

    

    public Tesis(String titulo, String mencion, Estudiante estudiante) {
        this.titulo = titulo;
        this.mencion = mencion;
        this.estudiante = estudiante;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMencion() {
        return mencion;
    }
    public void setMencion(String mencion) {
        this.mencion = mencion;
    }


    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((mencion == null) ? 0 : mencion.hashCode());
        result = prime * result + ((estudiante.getNombre() == null) ? 0 : estudiante.getNombre().hashCode());
        result = prime * result + ((estudiante.getCi() == null) ? 0 : estudiante.getCi().hashCode());
        return result;
    }

    public void show(){
        System.out.println("--------------------------------TESIS------------------------------");
        System.out.println("ESTUDIANTE: "+estudiante.getNombre()+" CI: "+estudiante.getCi());
        System.out.println("TITULO: "+titulo);
        System.out.println("MENCION: "+mencion);
    }
    
}
