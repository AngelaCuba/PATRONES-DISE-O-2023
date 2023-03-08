package primerParcialFilaB.ejercicio5Interpreter;

public class Suma extends ExpresionNumerica{

    @Override
    public void interpreter(Context context) {
        context.input = context.input.substring(1);
    }
    
}
