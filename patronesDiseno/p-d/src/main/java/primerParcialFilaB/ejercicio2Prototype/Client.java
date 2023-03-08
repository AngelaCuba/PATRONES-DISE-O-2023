package primerParcialFilaB.ejercicio2Prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Celular og = new Celular("papa3", "3 inches", "0.5 kg", new Camara("ak46", "frontal"), "Japon", "10002");
        Celular og2 = og.clone();
        Celular og3 = og.clone();
        Celular og4 = og.clone();
        Celular og5 = og.clone();

        og2.setImei("10003");
        og3.setImei("10004");
        og4.setImei("10005");
        og5.setImei("10006");

        List<Celular> listado = new ArrayList<>();
        listado.add(og);
        listado.add(og2);
        listado.add(og3);
        listado.add(og4);
        listado.add(og5);

        for(Celular aux : listado){
            aux.show();
        }
    }
}
