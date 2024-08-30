package cs213.jpsr;

public class CustomizableDecoration<T extends Comparable<Object>> {
    T decoration;
    CustomizableDecoration<T> next;
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
}

