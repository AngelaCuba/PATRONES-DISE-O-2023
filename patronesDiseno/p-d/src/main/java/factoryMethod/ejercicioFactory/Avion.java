package factoryMethod.ejercicioFactory;

public class Avion {
    private String marca;
    private String capacidad;
    private String modelo;
    private int numeroAsientos;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public Avion(String marca, String capacidad, String modelo, int numeroAsientos){
        this.marca=marca;
        this.capacidad=capacidad;
        this.modelo=modelo;
        this.numeroAsientos=numeroAsientos;
    }

    public void show(){
        System.out.println("MARCA: "+marca+" MODELO: "+modelo+" CAPACIDAD: "+capacidad+" NUMERO DE ASIENTOS: "+numeroAsientos);
    }
}
