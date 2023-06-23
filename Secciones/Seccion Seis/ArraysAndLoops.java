public class ArraysAndLoops {
    public static void main(String[] args) {
        String[] reinos = {"Mercia", "Wessex", "Northumbria", "East Anglia"};
        System.out.println("The number of elements is "+ reinos.length);
        for (int i = 0; i < reinos.length; i++){
            System.out.println("The element at index " + i + " is " + reinos[i]);
        }
    }
}
