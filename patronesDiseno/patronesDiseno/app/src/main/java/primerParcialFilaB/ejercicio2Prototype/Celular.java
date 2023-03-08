package primerParcialFilaB.ejercicio2Prototype;

public class Celular implements ICelular{


    private String modelo;
    private String tamano;
    private String peso;
    private Camara camara;
    private String origen;
    private String imei;

    
    

    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public String getTamano() {
        return tamano;
    }



    public void setTamano(String tamano) {
        this.tamano = tamano;
    }



    public String getPeso() {
        return peso;
    }



    public void setPeso(String peso) {
        this.peso = peso;
    }



    public Camara getCamara() {
        return camara;
    }



    public void setCamara(Camara camara) {
        this.camara = camara;
    }



    public String getOrigen() {
        return origen;
    }



    public void setOrigen(String origen) {
        this.origen = origen;
    }



    public String getImei() {
        return imei;
    }



    public void setImei(String imei) {
        this.imei = imei;
    }



    public Celular(String modelo, String tamano, String peso, Camara camara, String origen, String imei) {
        this.modelo = modelo;
        this.tamano = tamano;
        this.peso = peso;
        this.camara = camara;
        this.origen = origen;
        this.imei = imei;
    }

    public void show(){
        System.out.println("---------------CELULAR----------------");
        System.out.println("MODELO: "+modelo+" TAMAÑO: "+tamano+" PESO: "+peso);
        camara.show();
        System.out.println("ORIGEN: "+origen);
        System.out.println("IMEI: "+imei);
    }


    @Override
    public Celular clone(){
        Celular clon = new Celular(this.modelo, this.tamano, this.peso, this.camara, this.origen, this.imei); 
        return clon;
    }
    
}
