package state.ejercicio;

import java.util.List;
import java.util.Random;
import java.util.List;

public class Prendido implements IStateComputer {
    @Override
    public void comportamientoComputadora(Computadora computadora) {
        System.out.println("---------------------------COMPUTADORA--------------------------");
        int rand = new Random().nextInt(8) + 1;
        int numeroProgramas = rand;
        for(String i : List.of("PowerPoint", "Word", "Excel", "TexMaker", "VisualStudioCode", "Google Chrome", "Discord")){
            if(rand>0){
                computadora.addPrograma(i);
                rand--;
            }
        }
        
        computadora.setCpu(numeroProgramas*5);
        computadora.setRam(numeroProgramas*5);
        System.out.println("LA COMPUTADORA ESTA PRENDIDA.............................................");
        computadora.show();
    }
}
