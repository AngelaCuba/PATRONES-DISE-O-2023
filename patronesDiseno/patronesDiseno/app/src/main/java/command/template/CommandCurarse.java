package command.template;

public class CommandCurarse implements ICommand {

    private Personaje personaje;

    

    public CommandCurarse(Personaje personaje) {
        this.personaje = personaje;
    }



    @Override
    public void execute() {
        this.personaje.curarse();
    }
    
}
