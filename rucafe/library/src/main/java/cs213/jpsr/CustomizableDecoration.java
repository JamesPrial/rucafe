package cs213.jpsr;

public class CustomizableDecoration<T extends Comparable<Object>> {
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
    public boolean add(Comparable<Object> obj){
        if(decoration.compareTo(obj) < 0){
            return false;
        }
        if(next == null){
            this.next = new CustomizableDecoration<>()
        }
    }
}

