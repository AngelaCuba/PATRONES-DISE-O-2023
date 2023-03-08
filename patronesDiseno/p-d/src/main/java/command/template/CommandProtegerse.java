package command.template;

public class CommandProtegerse implements ICommand {

    private Personaje personaje;

    

    public CommandProtegerse(Personaje personaje) {
        this.personaje = personaje;
    }



    @Override
    public void execute() {
        this.personaje.protegerse();
    }
}
