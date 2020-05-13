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
        System.out.println("What would you like to do?");
        System.out.println("1. Add an order");
        System.out.println("2. Remove an order");
        System.out.println("3. Update an order");
        System.out.println("4. All done");
        String userAction = input.nextLine();

        while(userAction != "4"){

            if(userAction == "1"){
                System.out.println("You would like to add an order. What variety of cookie would you like?");
                String cookieType = input.nextLine();
                System.out.println("How many boxes would you like to add?");
                String numType = input.nextLine();
                System.out.println("You are adding " + numType + " boxes of " + cookieType + " to a new order.");
                //working on adding to Master Order
            } else if (userAction == "2"){
                System.out.println("You would like to remove an order. What variety of cookie would you like to remove?");
                String varietyToRemove = input.nextLine();
                System.out.println("You are removing " + myOrder.getVarietyBoxes(varietyToRemove) + varietyToRemove);
                myOrder.removeVariety(varietyToRemove);
            }else if(userAction == "3"){

            }

        }







    }
}
