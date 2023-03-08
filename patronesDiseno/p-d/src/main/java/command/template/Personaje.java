package command.template;

public class Personaje {
    private String name;

    

    public Personaje(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saltar(){
        System.out.println(name+" SALTA");
    }
    
    public void correr(){
        System.out.println(name+" CORRE");
    }
    
    public void golpear(){
        System.out.println(name+" GOLPEA");
    }
    
    public void protegerse(){
        System.out.println(name+" SE PROTEGE");
    }
    
    public void curarse(){
        System.out.println(name+" RECUPERA VIDA");
    }
}
