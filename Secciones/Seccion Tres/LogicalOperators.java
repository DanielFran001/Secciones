public class LogicalOperators {
    public static void main(String[] args) {
        int chemestryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemestryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We are sorry, you didnt get the scholarship");
        }
        int credits = 56;
        Double GPA =1.4;
         if (credits >= 40 && GPA >= 2.0){
             System.out.println("You earned your diploma!");
         } else{
             System.out.println("Sorry, you need at least 40 credits and a minimun GPA of 2.0 ");
         }
    }
}
