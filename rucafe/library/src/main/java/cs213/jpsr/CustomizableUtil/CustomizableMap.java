package cs213.jpsr.CustomizableUtil;

import java.util.HashMap;

import cs213.jpsr.interfaces.Customizable;
import cs213.jpsr.interfaces.RUCafeObject;

public class CustomizableMap<T extends RUCafeObject> implements Customizable, RUCafeObject {
    private HashMap<T, Integer> map;

    public CustomizableMap(){
        this.map = new HashMap<T, Integer>();
    }

    public boolean add(Object obj){
        if(obj instanceof T){
            
        }
    }
}
