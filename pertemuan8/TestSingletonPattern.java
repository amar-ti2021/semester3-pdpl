class MySingleton {
    private static MySingleton singleton = new MySingleton();

    private MySingleton() {
        System.out.print("Object Created...");
    }

    public static MySingleton getInstance() {
        return singleton;
    }
}

public class TestSingletonPattern {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        MySingleton s3 = MySingleton.getInstance();
    }
}