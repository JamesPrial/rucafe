public abstract class CustomizableMenuItem extends MenuItem implements Customizable {
    private CustomizableDecoration<MenuItem> head;
    private int decorationCount;
    public CustomizableMenuItem(){
        super();
        this.head = null;
        this.decorationCount = 0;
    }
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

    public boolean remove
}
