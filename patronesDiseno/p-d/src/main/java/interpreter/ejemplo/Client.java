package interpreter.ejemplo;

public class Client {
    public static void main(String[] args) {
        String msg = "1 + 2 + 3 - 4 - 2 + 2 + 10";
        Evaluador eval = new Evaluador(msg);
        System.out.println("RESPUESTA: "+eval.evaluateFormula());
    }
}
