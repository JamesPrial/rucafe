package cs213.jpsr.CustomizableUtil;

import cs213.jpsr.interfaces.RUCafeObject;

public class CustomizableDecoration<T extends RUCafeObject> {
    private T decoration;
    private int quantity;
    public CustomizableDecoration() throws Exception{
        throw new Exception();
    }
    public CustomizableDecoration(T decoration){
        this.decoration = decoration;
        this.quantity = 1;
    }
    public CustomizableDecoration(T decoration, int quantity){
        this.decoration = decoration;
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public T getDecoration(){
        return decoration;
    }

    

    public boolean equals(Object obj){
        if(obj instanceof CustomizableDecoration<?>){
            CustomizableDecoration<?> customizableDecorationObj = (CustomizableDecoration<?>)(obj);
            RUCafeObject objDec = customizableDecorationObj.getDecoration();
            return decoration.equals(objDec) && this.quantity == customizableDecorationObj.getQuantity();
        }
        return false;
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

