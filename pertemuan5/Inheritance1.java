class Bicycle {
    public int gear, speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) { this.speed -= decrement; }

    public void speedUp(int increment){ this.speed += increment; }

    public String toString(){ return ("No of gears are " + this.gear + "\n" + "speed of bicycle is " + this.speed);}
}

class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue){ this.seatHeight = newValue; }

    @Override public String toString() { return (super.toString() + "\nseat Height is " + this.seatHeight); }
}

public class Inheritance1{
    public static void main(String [] args){
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}