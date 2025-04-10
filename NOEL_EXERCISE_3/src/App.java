public class App {

    public static void main(String[] args) throws Exception {

        HybridVehicle car1 = new HybridSedan();
        car1.carName = "Toyota Camry";

        HybridVehicle car2 = new HybridPickup();
         car2.carName = "Toyota Tacoma";

        CarWash carwash = new CarWash(); 

        System.out.println("\nYour " + car1.carName + car1.fillgas());
        System.out.println("Your " + car1.carName + car1.ChargeBattery());
        System.out.println("The " + car1.carName + carwash.Wash());

        System.out.println("\nYour " + car2.carName + car2.fillgas());
        System.out.println("Your " + car2.carName + car2.ChargeBattery());
        System.out.println("The " + car2.carName + carwash.Wash());
        System.out.println();

        System.out.println();
      
    }
}
