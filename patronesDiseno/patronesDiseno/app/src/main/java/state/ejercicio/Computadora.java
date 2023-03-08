package state.ejercicio;

import java.util.Stack;

public class Computadora {
    private Stack<String> programas = new Stack<>();
    private double ram;
    private double cpu;

    private IStateComputer stateComputer;

    public Computadora(){
        stateComputer = new Apagado();
    }

    public Stack<String> getProgramas() {
        return programas;
    }
    public void setProgramas(Stack<String> programas) {
        this.programas = programas;
    }
    public double getRam() {
        return ram;
    }
    public void setRam(double ram) {
        this.ram = ram;
    }
    public double getCpu() {
        return cpu;
    }
    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void addPrograma(String programa){
        programas.push(programa);
    }
    public IStateComputer getStateComputer() {
        return stateComputer;
    }
    public void setStateComputer(IStateComputer stateComputer) {
        this.stateComputer = stateComputer;
    }

    public void useComputer(){
        this.stateComputer.comportamientoComputadora(this);
    }

    public void quitarPrograma(){
        if(!programas.empty()){
            System.out.println("CERRANDO: "+programas.peek());
            programas.pop();
        }
    }

    public void show(){
        System.out.println("RAM: "+ram+"%");
        System.out.println("CPU: "+cpu+"%");
        if(programas.size()>0){
            System.out.println("PROGRAMAS PRENDIDOS:");
            programas.stream().forEach(i -> System.out.println(i));
        } else{
            System.out.println("NO HAY PROGRAMAS PRENDIDOS");
        }
    }
    
}
