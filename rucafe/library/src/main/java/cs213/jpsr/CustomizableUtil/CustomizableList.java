package cs213.jpsr.CustomizableUtil;

import java.util.ArrayList;

import cs213.jpsr.interfaces.Customizable;
import cs213.jpsr.interfaces.RUCafeObject;

public class CustomizableList<E extends RUCafeObject> implements Customizable, RUCafeObject {
    private ArrayList<E> list;
    public CustomizableList(){
        head = null;
    }
    
    public boolean add(Object obj){
        if(head != null && obj instanceof Comparable<?>){
            return head.add(obj);
        }
        return false;
    }

    public boolean remove(Object obj){
        if(head != null && obj instanceof Comparable<?>){
            return head.remove(obj);
        }
        return false;
    }
}
