public class Tugas3{
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("NIM   : 0110221095");
        System.out.println("Nama  : Muhammad Amar Dafi");
        System.out.println("Kelas : 3TI04");
        System.out.println("==========================");
        for (int floor = 1; floor <= 20; floor++){
            int lift_button = (floor >= 13)? floor + 1 : floor;
            System.out.println("Tombol lift " + lift_button + " digunakan untuk mengakses lantai " 
                + floor);
        }
    }
}