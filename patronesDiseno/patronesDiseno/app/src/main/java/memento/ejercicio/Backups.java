package memento.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class Backups {

    private Map<String, Memento> mementos = new HashMap<>();


    public Backups createBackup(Memento memento){
        System.out.println("BACKUP EXITOSO: "+memento.getAlias());
        memento.getBaseDatos().show();
        mementos.put(memento.getAlias(), memento);
        return this;
    }

    public Memento getBackup(String key) throws Exception{
        if(mementos.containsKey(key)){
            return mementos.get(key);
        } else{
            throw new Exception("NO EXISTE EL BACKUP");
        }
    }
    
}
