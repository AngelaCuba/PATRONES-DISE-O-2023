package ejercicioSingletonLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance = null;
    private String nombreArchivo;
    private String directorio = System.getProperty("user.dir");

    private Logger(){
        nombreArchivo = "registro"+this.hashCode()+".txt";
    }

    public static Logger getInstance(){
        if(instance == null){
           multiThreadManage();
        }
        return instance;
    }

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new Logger();
        }
    }

    public void escribir(String transaccion){

        File archivo = new File(directorio, nombreArchivo);

        if(!archivo.exists()){
            try{
                System.out.println("SE CREARA EL REGISTRO EN: "+directorio);
                archivo.createNewFile();
            } catch (IOException errorCreacion){
                System.out.println("NO SE PUDO CREAR EL ARCHIVO");
            }
        }

        try{

            FileWriter out = new FileWriter(archivo, true);
            String lineBreak = transaccion+"\n";
            out.write(lineBreak.toCharArray());
            out.close();
        } catch(IOException noArchivo){
            System.out.println("NO SE PUDO ESCRIBIR EN EL REGISTRO");
        }

    }


}
