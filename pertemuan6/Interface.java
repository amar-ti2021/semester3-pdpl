interface Vehicle {
    void changeGear(int a);

    void speedUp(int a);

    void applyBrake(int a);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    public void applyBrake(int decrement) {
        this.speed = this.speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed :" + speed + " Gear :" + gear);
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    public void applyBrake(int decrement) {
        this.speed = this.speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed :" + speed + " Gear :" + gear);
    }
}

class Interface {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrake(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrake(3);

        System.out.println("Bike present state :");
        bike.printStates();
    }
}