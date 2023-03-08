package interpreter.template;

public class TerminalExpressionA extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("A")){
            context.output=context.output+"1";
            context.input=context.input.substring(1);
        }
        
    }
    
}
