package command.template;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private List<ICommand>  comandos = new ArrayList<>();
    private String accion;

    

    public Nivel(String accion) {
        this.accion = accion;
    }

    public Nivel addCommand(ICommand comando){
        comandos.add(comando);
        return this;
    }

    public void run(){
        System.out.println("ACCION: "+accion+"--------------------------------------------------------");
        for (ICommand cmd:comandos) {
            cmd.execute();
        }
        comandos.clear();
    }
}
