package primerParcialFilaB.ejercicio5Interpreter;

public class Numero extends ExpresionNumerica{

    private int size;

    public Numero(int size){
        this.size = size;
    }

    @Override
    public void interpreter(Context context) {
        if(context.divi){
            context.output = context.output / Integer.parseInt(context.input.substring(0, size));
            context.divi=false;
        } else{
            context.output = context.output+Integer.parseInt(context.input.substring(0, size));
        }
        context.input = context.input.substring(size);
    }
    
}

