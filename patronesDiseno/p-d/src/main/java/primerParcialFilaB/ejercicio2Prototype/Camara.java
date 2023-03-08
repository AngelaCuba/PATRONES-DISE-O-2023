package primerParcialFilaB.ejercicio2Prototype;

public class Camara {
    private String foco;
    private String lente;

    public Camara(String foco, String lente) {
        this.foco = foco;
        this.lente = lente;
    }

    public void show() {
        System.out.println("CAMARA: ");
        System.out.println("FOCO: "+foco+" LENTE: "+lente);
    }

    
}
