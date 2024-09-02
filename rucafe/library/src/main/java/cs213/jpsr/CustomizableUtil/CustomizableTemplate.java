package cs213.jpsr.CustomizableUtil;

public abstract class CustomizableTemplate<T> implements Customizable {
    private CustomizableDecoration<T> head;
    private int decorationCounter;
    public CustomizableTemplate(){
        decorationCounter = 0;
        head = null;
    }
    public final boolean add(Object obj){
        if(obj instanceof T){
            CustomizableDecoration<T> toAdd = new CustomizableDecoration<T>(obj, head);
            this.head = toAdd;
            decorationCount++;
            return true;
        }
       return false;
    }
    protected abstract boolean isAcceptableDecoration(Object obj);

    public final boolean remove(Object obj){

    }
}
