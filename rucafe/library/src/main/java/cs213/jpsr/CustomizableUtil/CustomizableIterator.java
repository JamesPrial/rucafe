package cs213.jpsr.CustomizableUtil;

import java.util.ListIterator;

import cs213.jpsr.interfaces.RUCafeObject;

public class CustomizableIterator<E extends RUCafeObject> implements ListIterator<RUCafeObject> {
    private int cursorPos;
    private CustomizableDecoration<E> ptr;
    private CustomizableIterator(CustomizableDecoration<E> head){
        this.ptr = head;
        this.prev = null;
        this.cursorPos = 0;
    }
    public static CustomizableIterator<RUCafeObject> newIterator(CustomizableDecoration<RUCafeObject> head){
        return new CustomizableIterator<RUCafeObject>(head);
    }
    public void set(RUCafeObject e){
        if(e instanceof RUCafeObject){
            ptr.setDecoration(e);
        }
        throw new UnsupportedOperationException("decorations must be rucafeobjects");
    }
}
