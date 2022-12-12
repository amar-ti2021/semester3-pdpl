class ABC {
    int x = 9;
}

public class DeepCopyExample {
    public static void main(String[] args) {
        ABC obj1 = new ABC();

        ABC obj2 = new ABC();

        obj2.x = 45;

        System.out.println("The Value of x is: " + obj1.x);
    }
}
