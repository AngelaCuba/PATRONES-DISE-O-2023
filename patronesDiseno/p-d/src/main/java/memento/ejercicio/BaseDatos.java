package memento.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private List<Persona> personas;

    

    public BaseDatos(){
        personas = new ArrayList<>();
    }

    public BaseDatos addPersona(Persona persona){
        if(!personas.contains(persona)){
            personas.add(persona);
            System.out.println("SE AÑADIO UNA NUEVA PERSONA");
        } else{
            persona.show();
            System.out.println("YA FUE AÑADIDA A LA BASE DE DATOS");
        }
        return this;
    }

    public void show(){
        System.out.println("**********************************************************************************************************");
        System.out.println("CANTIDAD DE PERSONAS: "+personas.size());
        personas.stream().forEach(a -> a.show());
    }

    public List<Persona> getPersonas() {
        List<Persona> aux = new ArrayList<>();
        for(Persona p : personas){
            aux.add(p);
        }
        return aux;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
