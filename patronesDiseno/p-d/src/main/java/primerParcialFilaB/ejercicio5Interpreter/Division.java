package primerParcialFilaB.ejercicio5Interpreter;

public class Division extends ExpresionNumerica{

    @Override
    public void interpreter(Context context) {
        context.divi=true;
        context.input = context.input.substring(1);
    }
    
}
