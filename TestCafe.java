import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeInstance = new CafeUtil();
        // Display sum of numbers
        int myStreakGoal = cafeInstance.getStreakGoal();
        // Sum total of numbers
        double[] myOrders = { 10.2, 3, 5, 6, 6 };
        double myTotalOrder = cafeInstance.getOrderTotal(myOrders);
        // Items to printout
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("drip coffee");
        myList.add("cappuccino");
        myList.add("latte");
        myList.add("mocha");

        // Testing
        // System.out.println(myStreakGoal);
        // System.out.println(myTotalOrder);
        // cafeInstance.displayMenu(myList);
        cafeInstance.addCustomer(myList);

    }
}