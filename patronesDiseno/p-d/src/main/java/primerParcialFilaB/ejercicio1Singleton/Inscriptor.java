package primerParcialFilaB.ejercicio1Singleton;

import java.util.ArrayList;
import java.util.List;

public class Inscriptor {
    private static Inscriptor instance = null;

    private List<Registro> inscripciones = new ArrayList<>();

    private Inscriptor(){
        System.out.println("ABRIENDO INSCRIPCIONES....");
    }

    public void inscribirTesis(Registro registro){
        if(inscripciones.contains(registro)){
            System.out.println("LA TESIS YA HA SIDO REGISTRADA...................");
        } else{
            inscripciones.add(registro);
            System.out.println("SE REGISTRO UNA TESIS..................");
        }
    }

    public void verRegistro(){
        System.out.println("----------------------LISTADO DE REGISTROS---------------------------");
        for(Registro registro : inscripciones){
            registro.show();
        }
    }

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new Inscriptor();
        }
    }

    public static Inscriptor getInstance(){
        if(instance == null){
            multiThreadManage();
        }
        return instance;
    }
}
