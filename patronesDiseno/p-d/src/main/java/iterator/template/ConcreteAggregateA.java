package iterator.template;

public class ConcreteAggregateA implements IAggregate{

    private String [] names;
    private String attribute;
    private int position=0;

    public ConcreteAggregateA(){
        names = new String[4];
    }

    public String[] getNames() {
        return names;
    }

    public ConcreteAggregateA setNames(String[] names) {
        this.names = names;
        return this;
    }

    public ConcreteAggregateA addName(String name){
        names[position] = name;
        position++;
        return this;
    }

    public String getAttribute() {
        return attribute;
    }

    public ConcreteAggregateA setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorA(this.names);
    }
    
}
