import java.util.*;
import java.time.LocalTime;
class Vehicle {
    String type;
    int tire;
    int value;

    public Vehicle(String type, int tire, int value) {
        this.type = type;
        this.tire = tire;
        this.value = value;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current local time: " + currentTime);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vehicles:");
        int numVehicles = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numVehicles; i++) {
            System.out.println("Enter vehicle type (SUV, Sedan, Bike, Auto):");
            String type = scanner.nextLine();

            int tire;
            switch (type.toLowerCase()) {
                case "suv":
                case "sedan":
                    tire = 4;
                    break;
                case "bike":
                    tire = 2;
                    break;
                case "auto":
                    tire = 3;
                    break;
                default:
                    System.out.println("Invalid vehicle type. Using default tire count of 4.");
                    tire = 4 ;
            }
            
            System.out.println("Enter vehicle value:");
            int value = scanner.nextInt();
            scanner.nextLine();

            vehicles.add(new Vehicle(type, tire, value));
        }

        System.out.println("Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Type: " + vehicle.type + ", Tires: " + vehicle.tire + ", Value: " + vehicle.value);
        }

        scanner.close();
    }
}
