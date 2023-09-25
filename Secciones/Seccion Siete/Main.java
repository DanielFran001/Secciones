public class Main {
    public static void main(String[] args) {

        Car nissan = new Car("Nissan",10000, 2009, "Gray", new String[]{"Tires", "Keys"});
        Car dodge = new Car("Dodge", 86000, 2018, "Orange", new String[]{"Tires", "Keys"});
        Car nissan2 = new Car(nissan);
        System.out.println(nissan);
        System.out.println(dodge);
        System.out.println(nissan2);



    }
}