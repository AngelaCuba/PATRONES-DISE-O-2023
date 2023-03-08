package builder.ejemplo;

public class Client {
    public static void main(String[] args) {
        
        Cocinero cocinero = new Cocinero();
        PizzaCarnivora carnivora = new PizzaCarnivora();
        PizzaHawaiana hawaiana = new PizzaHawaiana();

        cocinero.setTipoPizza(carnivora);
        cocinero.buildPizza();

        Pizza p1 = cocinero.getPizza();
        p1.showInfo();


        cocinero.setTipoPizza(hawaiana);
        cocinero.buildPizza();

        Pizza p2 = cocinero.getPizza();
        p2.showInfo();
    }
}
