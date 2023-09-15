public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.color = "Gray";
        nissan.make = "Nissan";
        nissan.price = 10000;
        nissan.year = 2009;

        Car dodge = new Car();
        dodge.year = 2018;
        dodge.make = "Dodge";
        dodge.price = 86000;
        dodge.color = "Orange";

        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price +
                ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
    }
}
