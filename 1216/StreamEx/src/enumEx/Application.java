package enumEx;


public class Application {
    public static void main(String[] args) {
        Car car = Car.get(CarType.SportCar);
        System.out.println(car);
        Car car2 = Car.get(CarType.SUV);
        System.out.println(car2);
    }
}
