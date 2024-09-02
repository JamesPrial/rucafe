package cs213.jpsr.CustomizableUtil;

import cs213.jpsr.interfaces.RUCafeObject;

public class CustomizableDecoration<T extends RUCafeObject> {
    private T decoration;
    private CustomizableDecoration<T> next;
    public CustomizableDecoration() throws Exception{
        throw new Exception();
    }
    public CustomizableDecoration(T decoration){
        this.decoration = decoration;
        this.next = null;
    }
    public CustomizableDecoration(T decoration, CustomizableDecoration<T> next){
        this.decoration = decoration;
        this.next = next;
    }
    public CustomizableDecoration<T> getNext(){
        return next;
    }
    public T getDecoration(){
        return decoration;
    }

    public void setDecoration(T newDec){
        this.decoration = newDec;
    }

    public boolean add(Comparable<Object> obj){
        if(decoration.compareTo(obj) < 0){
            return false;
        }
        if(next == null){
            this.next = new CustomizableDecoration<>()
        }
    }
}

