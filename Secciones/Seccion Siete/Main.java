public class Main {
    public static void main(String[] args) {

        Car nissan = new Car("Nissan",10000, 2009, "Gray", new String[]{"Tires", "Keys"});
        Car dodge = new Car("Dodge", 86000, 2018, "Orange", new String[]{"Tires", "Keys"});

        Car nissan2 = new Car(nissan);
        nissan2.setColor("Orange");
        nissan2.drive();

        Car nissan3 = new Car(nissan);
        nissan3.setYear(2024);
        nissan3.drive();



    }
}