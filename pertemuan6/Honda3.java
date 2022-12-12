class Bike {
    int speedLimit = 150;
}

public class Honda3 extends Bike {
    int speedLimit = 90;

    public static void main(String[] args) {
        Bike obj = new Honda3();
        System.out.println(obj.speedLimit);
    }
}
