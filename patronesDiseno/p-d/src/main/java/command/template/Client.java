package command.template;

public class Client {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Kaliman");

        CommandCorrer correr = new CommandCorrer(personaje);
        CommandCurarse curarse = new CommandCurarse(personaje);
        CommandGolpear golpear = new CommandGolpear(personaje);
        CommandProtegerse protegerse = new CommandProtegerse(personaje);
        CommandSalta salta = new CommandSalta(personaje);

        Nivel nivelI = new Nivel("CORRER");
        nivelI.addCommand(correr);

        Nivel nivelII = new Nivel("REGENERACION");
        nivelII.addCommand(protegerse).addCommand(curarse);

        Nivel nivelIII = new Nivel("ATACAR");
        nivelIII.addCommand(salta).addCommand(correr).addCommand(golpear);

        Nivel nivelIV = new Nivel("CONTRA ATAQUE");
        nivelIV.addCommand(correr).addCommand(salta).addCommand(correr).addCommand(salta).addCommand(protegerse).addCommand(golpear).addCommand(curarse).addCommand(correr);


        nivelI.run();
        nivelII.run();
        nivelIII.run();
        nivelIV.run();
    }
}
