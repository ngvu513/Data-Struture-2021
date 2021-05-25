package ArrayList;

import java.util.ArrayList;

public class MarketingManager {
    private ArrayList<Marketing> marketings;

    public MarketingManager() {
        this.marketings = new ArrayList<>();
    }

    public void add(Marketing marketing) {
        this.marketings.add(marketing);
    }

    public void remove(Marketing marketing) {
        this.marketings.remove(marketing);
    }

    public double calTotalSalesAmount() {
        double totalAmount = 0;

        for (Marketing item: this.marketings) {
            totalAmount += item.getSalesAmount();
        }

        return totalAmount;
    }

    @Override
    public String toString() {
        return "MarketingManager" + "\n" + "{" +
                "marketings=" + marketings.toString() +
                '}';
    }

    public void remove(String employeeName) {
        for (Marketing item: this.marketings) {
            if(item.getEmployeeName().equals(employeeName)) {
                this.marketings.remove(item);
            }
        }
    }

    public void set(int index, Marketing marketing) {
        this.marketings.set(index, marketing);
    }

    public Marketing get(int index) {
        return this.marketings.get(index);
    }

    // [5,6,3,2,6]
    //
    public void clear() {
        this.marketings.clear();
    }

    public int size() {
        return this.marketings.size();
    }

    public static void main(String[] args) {
        Marketing marketing1 = new Marketing("name1", "product1", 20);
        Marketing marketing2 = new Marketing("name2", "product2", 80);
        Marketing marketing3 = new Marketing("name3", "product3", 15);

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.add(marketing2);
        marketingManager.add(marketing1);
        marketingManager.add(marketing3);

        System.out.println(marketingManager.toString());
        System.out.println(marketingManager.size());

        System.out.println("Total Sales Amount : " + marketingManager.calTotalSalesAmount());

    }
}
