public class BooleanComparisons {
    public static void main(String[] args) {
        int chemestryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
        System.out.println(biologyGrade > chemestryGrade);

        double sales = 37.55;
        double costs = 25.5;

        System.out.println(sales > costs);

        System.out.println(biologyGrade >= englishGrade);
        System.out.println(biologyGrade >= chemestryGrade);
        System.out.println(chemestryGrade >= biologyGrade);

        System.out.println(chemestryGrade == biologyGrade);
        System.out.println(englishGrade == biologyGrade);

        System.out.println(chemestryGrade != biologyGrade);
        System.out.println(englishGrade != biologyGrade);

        //Unicamente para valores, para String se usa el siguiente "equals":

        String sentence = "i love this course!";
        String sentence2 = "i love this course!";
        System.out.println(!sentence.equals(sentence2));
        //signo de exclamacion antes y no en el .equals

    }
}
