

public class Donut extends MenuItem {
    private static final double CAKE_PRICE = 1.59;
    private static final double HOLE_PRICE = 0.33;
    private static final double YEAST_PRICE = 1.39;

    private DonutFlavors flavor;
    private DonutTypes type;

    public Donut(){
        super();
        this.flavor = DonutFlavors.NOT_FOUND;
        this.type = DonutTypes.NOT_FOUND;
    }
    public Donut(double price){
        super(price);
        this.flavor = ;
        this.type = type;
    }
    public Donut(double price, DonutFlavors flavor, DonutTypes type){
        super(price);
        this.flavor = flavor;
        this.type = type;
    }
    public Donut(double price, DonutFlavors flavor, DonutTypes type){
        super(price);
        this.flavor = flavor;
        this.type = type;
    }
    
}
