import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu={"Expresso", "Iced Coffee", "Macciato"};
        menu[2]= "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu= new String[5];

        for(int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "Casa Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
