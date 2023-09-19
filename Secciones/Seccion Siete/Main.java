public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",10000, 2009, "Gray");
        Car dodge = new Car("Dodge", 86000, 2018, "Orange");

        Car nissan2 = new Car(nissan);
        nissan2.setColor("Orange");

        nissan2.drive();



    }
}