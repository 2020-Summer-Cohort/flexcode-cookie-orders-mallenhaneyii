package cookies;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MasterOrder myOrder = new MasterOrder();
        myOrder.addOrder(new CookieOrder("Tagalongs", 1));
        myOrder.addOrder(new CookieOrder("Thin Mints", 5));
        myOrder.addOrder(new CookieOrder("Samoas", 2));
        myOrder.addOrder(new CookieOrder("Tagalongs", 3));

        System.out.println("Current Order");
        myOrder.showOrder();
        System.out.println();
        System.out.println("You have orders " + myOrder.getTotalBoxes() + " boxes");
        System.out.println();
        System.out.println("What would you like to remove? (specify a variety of none)");

        String varietyToRemove = input.nextLine();

        System.out.println("You are removing " + myOrder.getVarietyBoxes(varietyToRemove) + " " + varietyToRemove);
        System.out.println();
        myOrder.removeVariety(varietyToRemove);
        System.out.println("Current Order");
        myOrder.showOrder();





    }
}
