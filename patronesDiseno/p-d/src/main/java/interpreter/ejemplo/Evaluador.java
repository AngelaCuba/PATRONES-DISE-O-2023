package interpreter.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends OperacionMatematicas {

    private List<OperacionMatematicas> formula = new ArrayList<>();
    private Context context;

    public Evaluador(String formulaOg){
        context = new Context(formulaOg.replace(" ", ""));
        for (String msg: formulaOg.split(" ")){
            switch(msg){
                case "+":
                formula.add(new TerminalExpressionSuma());
                break;

                case "-":
                formula.add(new TerminalExpressionResta());
                break;

                default:
                formula.add(new TerminalExpressionNumerico(msg.length()));
                break;
            }
        }
    }

    public int evaluateFormula(){
        for(OperacionMatematicas operacionMatematicas:formula){
            operacionMatematicas.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        
    }
    
}
