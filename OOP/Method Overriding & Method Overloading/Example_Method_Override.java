class Vehicle{
    public void FuelEfficiency(){
        System.out.println("Fuel Efficiency varience of Vehicle.");
    }
}

class Car extends Vehicle{
    @Override
    public void FuelEfficiency(){
        System.out.println("Fuel Efficiency of Car is 16 km/l.");
    }
}

class Bike extends Vehicle{
    @Override
    public void FuelEfficiency(){
        System.out.println("Fuel Efficiency of Bike is 40 km/l.");
    }
}

public class Example_Method_Override {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.FuelEfficiency();
        myBike.FuelEfficiency();
    }
}