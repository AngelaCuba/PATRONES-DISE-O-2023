package command.template;

public class CommandCorrer implements ICommand {

    private Personaje personaje;

    

    public CommandCorrer(Personaje personaje) {
        this.personaje = personaje;
    }



    @Override
    public void execute() {
        this.personaje.correr();
    }
    
}
