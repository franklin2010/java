public class sales {
    public static void main(String[] args) {
        double annualProfit = (30000 - 5000);
        double fixedSales = (6.0 / 100 * 5000) + (8.0 / 100 * 5000);
        annualProfit -= fixedSales;
        double sales = (10.0 / 100 * 10000);
        int salesCounter = 2;

        while (annualProfit > 0) {
          annualProfit -= sales;
            salesCounter += 1;
        }
        System.out.println(salesCounter + " sales");
    }
}
