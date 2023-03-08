package abstractFactory.ejemplo;

import java.util.HashMap;
import java.util.Map;

public class FactoryIDE {

    private static Map<String, IIDE> ideMap = new HashMap<>();

    public static IIDE make(String type){
        IIDE ide;
        switch(type){
            case "java":
                ide = new Eclipse();
                break;
            case "otro":
                ide = new VisualStudio();
                break;
            default:
                ide = new VisualStudio();
        }
        return ide;
    }


    public static IIDE makeMap(String type){
        ideMap.put("java", new Eclipse());
        ideMap.put("otro", new VisualStudio());
        return ideMap.containsKey(type)?ideMap.get(type):null;
    }
}
