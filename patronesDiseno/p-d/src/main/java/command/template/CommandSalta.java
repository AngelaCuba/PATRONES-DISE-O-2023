package command.template;

public class CommandSalta implements ICommand {

    private Personaje personaje;

    

    public CommandSalta(Personaje personaje) {
        this.personaje = personaje;
    }



    @Override
    public void execute() {
        this.personaje.saltar();
    }
    
}
