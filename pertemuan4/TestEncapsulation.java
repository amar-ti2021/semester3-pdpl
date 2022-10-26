public class TestEncapsulation{
    public static void main(String[]args){
        Encapsulate obj = new Encapsulate();
        obj.setAge(19);
        System.out.println(obj.getAge());

    }
}
class Encapsulate{
    protected int geekAge;
    private int getAge(){
        return geekAge;
    }
    private void setAge(int newAge){ geekAge = newAge;}
}

