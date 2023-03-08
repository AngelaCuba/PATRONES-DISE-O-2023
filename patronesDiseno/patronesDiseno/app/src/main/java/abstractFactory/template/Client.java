package abstractFactory.template;

public class Client {
    public static void main(String[] args) {
        String dato="B";

        /*if(dato.equals("ConcreteProductA")){

        } else if(dato.equals("ConcreteProductB")){

        }*/

        AbstractFactory.make(dato).methodA();
    }
}
