package DesignPattern.creation.singleton;

class WaterJug{
    private int waterQuantity = 500;
    private WaterJug(){}
    private static WaterJug object = null;

    // Method to provide the service of Giving Water.
    public int getWater(int quantity){
        waterQuantity -= quantity;
        System.out.println(waterQuantity);
        return quantity;
    }
    // Method to return the object to the user.
    public static WaterJug getInstance(){
        // Will Create a new object if the object is not already created and return the object.
        if(object == null){
            object = new WaterJug();
        }
        return object;
    }
}

public class WaterJugSingleton {
    public static void main(String[] args) {
        WaterJug waterJug = WaterJug.getInstance();
        waterJug.getWater(2);
    }
}
