public class CustomizablePriceBridge {
    public static CustomizablePriceBridge instance = null;
    public static CustomizablePriceBridge getInstance(){
        if(instance == null){
            return new CustomizablePriceBridge();
        }
        return instance;
    }
}
