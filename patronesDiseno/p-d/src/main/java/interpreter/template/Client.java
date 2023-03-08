package interpreter.template;

public class Client {
    public static void main(String[] args) {
        String msg = "A A B B A";
        NonTerminalExpression eval = new NonTerminalExpression(msg);
        System.out.println("RESPUESTA: "+eval.outputMessage());
    }
}
