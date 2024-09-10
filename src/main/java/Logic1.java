public class car {
    public static void main(String[] args){
        
    }
    
    private String carName;
    private double mileDriven;
    private double gallonsUsed;
    
    public car(){
         carName = "";
         mileDriven = 0.0;
         gallonsUsed = 0.0;
    }
    
    public car(String name, double miles, double gallons){
         carName = name;
         mileDriven = miles;
         gallonsUsed = gallons;
    }
    public String getcarName(){
         return carName;
    }
    public double getMilesDriven(){
        return mileDriven;  
    }
    public double getGallonsUsed(){
        return gallonsUsed;  
    }
    public void setCarName(String newCar){
        carName = newCar;
    }
    public void setmilesDriven(double newMiles){
        mileDriven = newMiles;
    }
    public void setGallonsUsed(double newGallons){
        gallonsUsed = newGallons;
    }
}
