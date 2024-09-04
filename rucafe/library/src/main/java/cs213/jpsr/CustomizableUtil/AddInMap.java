package cs213.jpsr.CustomizableUtil;

import java.util.HashMap;

import cs213.jpsr.interfaces.AddIn;
import cs213.jpsr.interfaces.Customizable;

public class AddInMap implements Customizable {
    private HashMap<AddIn, Integer> map;

    public AddInMap(){
        this.map = new HashMap<AddIn, Integer>(); 
    }

    public boolean add(Object obj){
        if(obj instanceof AddIn){
            if(map.containsKey(obj)){
                map.put((AddIn)(obj), (map.get(obj).intValue() + 1));
            }else {
                map.put((AddIn)(obj), 1);
            }
            return true;
        }
        return false;
    }

    public boolean remove(Object obj){
        if(obj instanceof AddIn){
            if(map.containsKey(obj)){
                if(!map.remove(obj, 1)){
                    map.put((AddIn)(obj), (map.get(obj).intValue() - 1));
                }
                return true;
            }
        }
        return false;
    }
    
}
