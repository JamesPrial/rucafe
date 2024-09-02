package cs213.jpsr.CustomizableUtil;

import java.util.LinkedList;

import cs213.jpsr.interfaces.Customizable;
import cs213.jpsr.interfaces.CustomizableDecoration;

public abstract class CustomizableMenuItem extends MenuItem implements Customizable {
    private LinkedList<MenuItem> head;
    private int decorationCount;
    public CustomizableMenuItem(){
        super();
        this.head = null;
        this.decorationCount = 0;
    }
    @Override
    //USE FUNCTIONAL METHODS~
    public boolean add(Object obj){
        if(obj instanceof MenuItem){
            CustomizableDecoration<MenuItem> toAdd = new CustomizableDecoration<MenuItem>((MenuItem)obj, head);
            this.head = toAdd;
            decorationCount++;
            return true;
        }
       return false;
    }
    protected abstract boolean isAddable(Object obj);
    public boolean remove
}
