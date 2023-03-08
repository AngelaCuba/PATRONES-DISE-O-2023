package ejemploPrototype;

public class Persona {

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    private String ci; 

    public Persona(String name, String ci){
        this.name = name;
        this.ci = ci;
    }
}
