package command.template;

public class CommandGolpear implements ICommand {

    private Personaje personaje;

    

    public CommandGolpear(Personaje personaje) {
        this.personaje = personaje;
    }



    @Override
    public void execute() {
        this.personaje.golpear();
    }
    
}

