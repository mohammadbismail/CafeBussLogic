import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        int[] myArr = new int[10];
        for (int i = 0; i < myArr.length; i++) {
            sum = +i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    public static void displayMenu(ArrayList<String> menuItems) {
        // for (String item : menuItems) {
        // System.out.println(item);
        // }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName);
        String formattedOutput = String.format("There are %x people infront of you", customers.size());
        System.out.println(formattedOutput);
    }

}
