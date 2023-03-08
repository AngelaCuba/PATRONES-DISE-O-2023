package mediator;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion {

    private Map<String, QA> qas = new HashMap<>();
    private Map<String, DEV> devs = new HashMap<>();
    private Map<String, SM> sms = new HashMap<>();

    public Skype addQA(QA qa){
        qas.put(qa.getCi(), qa);
        return this;
    }

    public Skype addDEV(DEV dev){
        devs.put( dev.getCi(), dev);
        return this;
    }

    public Skype addSM(SM sm){
        sms.put(sm.getCi(), sm);
        return this;
    }

    @Override
    public void send(String mensaje, Persona persona) {
        if(persona.getTipo()=="sm"){
            qas.forEach((a,b) -> b.messageReceived(mensaje));
            devs.forEach((a,b) -> b.messageReceived(mensaje));
            sms.entrySet().stream().filter(a -> a.getKey() != persona.getCi()).forEach(a -> a.getValue().messageReceived(mensaje));
        } else if (persona.getTipo()=="qa"){
           qas.entrySet().stream().filter(a -> a.getKey() != persona.getCi()).forEach(a -> a.getValue().messageReceived(mensaje));
        } else if (persona.getTipo()=="dev"){
            devs.entrySet().stream().filter(a -> a.getKey() != persona.getCi()).forEach(a -> a.getValue().messageReceived(mensaje));
         }
        
    }
    
}
