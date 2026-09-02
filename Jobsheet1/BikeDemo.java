public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();
        
        mountainBike1.setBrand("Trek");
        mountainBike1.gearChanges(2);
        mountainBike1.speedAcceleration(10);
        mountainBike1.printInfo();
        mountainBike1.gearChanges(1);
        mountainBike1.speedDeceleration(5);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.gearChanges(3);
        mountainBike2.speedAcceleration(20);
        mountainBike2.printInfo();
        mountainBike2.gearChanges(2);
        mountainBike2.speedDeceleration(10);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.gearChanges(4);
        roadBike1.speedAcceleration(15);
        roadBike1.printInfo();
        roadBike1.gearChanges(3);
        roadBike1.speedDeceleration(5);
        roadBike1.printInfo();      
    }
}