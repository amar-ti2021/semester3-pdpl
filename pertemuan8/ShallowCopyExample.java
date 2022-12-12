class ABC {
    int x = 9;
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        ABC obj1 = new ABC();

        ABC obj2 = obj1;

        obj2.x = 45;

        System.out.println("The Value of x is: " + obj1.x);
    }
}
