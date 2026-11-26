import java.util.ArrayList;
import java.util.Collections;

public class ProductPriceList {
    public static void main(String[] args) {

        ArrayList<Double> prices = new ArrayList<>();

        prices.add(100.0);
        prices.add(250.0);
        prices.add(150.0);
        prices.add(500.0);
        prices.add(300.0);
        prices.add(450.0);
        prices.add(700.0);
        prices.add(200.0);
        prices.add(350.0);
        prices.add(600.0);

        System.out.println("all prices: " + prices);

        prices.set(2, 180.0);
        System.out.println("after updating price: " + prices);

        System.out.println("highest price: " + Collections.max(prices));
        System.out.println("lowest price: " + Collections.min(prices));

        double sum = 0;

        for (double price : prices) {
            sum += price;
        }

        double average = sum / prices.size();
        System.out.println("average price: " + average);

        Collections.sort(prices);
        System.out.println("sorted prices: " + prices);

        System.out.println("prices between 200 and 500:");

        for (double price : prices) {
            if (price >= 200 && price <= 500) {
                System.out.println(price);
            }
        }
    }
}