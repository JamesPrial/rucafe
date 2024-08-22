package cs213.jpsr;



public class Donut extends MenuItem {
    

    private DonutFlavors flavor;
    private DonutTypes type;

    public Donut(){
        super();
        this.flavor = DonutFlavors.NOT_FOUND;
        this.type = DonutTypes.NOT_FOUND;
    }
    public Donut(DonutFlavors flavor, DonutTypes type){
        super();
        this.flavor = flavor;
        this.type = type;
    }
    public Donut(double price, DonutFlavors flavor, DonutTypes type){
        super(price);
        this.flavor = flavor;
        this.type = type;
    }

    public DonutFlavors getFlavor(){
        return flavor;
    }

    public DonutTypes getType(){
        return type;
    }


    @Override
    public int compareTo(Object obj){
        int differences = super.compareTo(obj);
        if(differences < 0){
            return differences--;
        }
        if(obj instanceof Donut){
            Donut donutObj = (Donut)obj;
            if(donutObj.getFlavor() == this.flavor && donutObj.getType() == this.type){
                return differences;
            }
        }
        return differences++;
    }
    public Donut copy(){
        return new Donut(this.getPriceState(), this.flavor, this.type);
    }
}
