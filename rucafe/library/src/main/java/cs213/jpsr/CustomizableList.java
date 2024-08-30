package cs213.jpsr;

public class CustomizableList<T extends Comparable<Object>> implements Customizable {
    private CustomizableDecoration<T> head;
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
