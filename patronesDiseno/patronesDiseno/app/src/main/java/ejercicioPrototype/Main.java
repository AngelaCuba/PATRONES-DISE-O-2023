package ejercicioPrototype;

public class Main {
    public static void main(String[] args) {
        Celular prototypeA = new Celular("Samsung", "R10", "5 inches", 2, "256 GB", "Android 12",
         4, true, 3, "1 d 8 h", new Accesorios(false, true, false, true));
        prototypeA.setSim(new Sim("Entel", "7068809"));

        //5 CELULARES A PARTIR DEL ORIGINAL

        Celular prototypeB = (Celular) prototypeA.clone();
        Celular prototypeC = (Celular) prototypeA.clone();
        Celular prototypeD = (Celular) prototypeA.clone();
        Celular prototypeE = (Celular) prototypeA.clone();
        Celular prototypeF = (Celular) prototypeA.clone();

        //CAMBIOS
        prototypeB.setSim(new Sim("Entel", "72584173"));
        prototypeC.setSim(new Sim("Tigo", "6892683"));
        prototypeD.setSim(new Sim("Viva", "7770692"));
        prototypeE.setSim(new Sim("Entel", "8349023"));
        prototypeF.setSim(new Sim("Tigo", "6349834"));

        //MOSTRAR

        prototypeA.show();
        prototypeB.show();
        prototypeC.show();
        prototypeD.show();
        prototypeE.show();
        prototypeF.show();
    }
}
