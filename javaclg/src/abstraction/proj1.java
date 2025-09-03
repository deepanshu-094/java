package abstraction;

abstract class vehicle {
    abstract void start();
    abstract void brake();
}

class car extends vehicle {
    void start() {
        System.out.println("car: starts with a key");
    }
    void brake() {
        System.out.println("car: apply brake");
    }
}

class bike extends vehicle {
    void start() {
        System.out.println("bike: starts with a kick");
    }
    void brake() {
        System.out.println("bike: apply brake");
    }
}

public class proj1 {
    public static void main(String[] args) {
        vehicle v1 = new car();
        vehicle v2 = new bike();

        v1.start();
        v1.brake();
        v2.start();
        v2.brake();
    }
}
