package primerParcialFilaB.ejercicio5Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends ExpresionNumerica {
    private List<ExpresionNumerica> ecuacion = new ArrayList<>();
    private Context context;

    public Evaluador(String input){
        context = new Context(input.replace(" ", ""));
        for (String charInput :input.split(" ")){
            switch (charInput){
                case "/":
                ecuacion.add(new Division());
                break;

                case "+":
                ecuacion.add(new Suma());
                break;

                default:
                ecuacion.add(new Numero(charInput.length()));
                break;
            }
        }
    }

    public double outputMessage(){
        for(ExpresionNumerica operacionMatematicas:ecuacion){
            operacionMatematicas.interpreter(context);
        }
        return context.output;
    }
    
    @Override
    public void interpreter(Context context) {
        
        
    }    
}
