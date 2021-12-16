package enumEx;

enum CarType {SportCar, Truck, SUV, Sedan}

public class Car {
    private final String type;
    private final int maxSpeed;

    private Car(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public static Car get(CarType type) {
        Car car = null;
        switch (type) {
            case SportCar:
                car = new Car("스포츠카", 300);
                break;
            case SUV:
                car = new Car("SUV", 150);
                break;
            case Truck:
                car = new Car("트럭", 100);
                break;
            case Sedan:
                car = new Car("세단", 200);
                break;
        }
        return car;
    }

    @Override
    public String toString() {
        return "자동차 타입 : " + type + ", 최고 속도 : " + maxSpeed;
    }
}
