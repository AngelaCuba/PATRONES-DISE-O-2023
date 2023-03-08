package iterator.template;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregateA banco1 = new ConcreteAggregateA();
        banco1.addName("popy1");
        banco1.addName("popy2");
        banco1.addName("popy3");
        banco1.addName("popy4");

        Iterator iterator;
        iterator=banco1.createIterator();

        while(iterator.hasNext()){
            String aux = (String) iterator.next();
            System.out.println(aux);
        }
    }
}
