import java.util.ArrayList;

public class Invoice {
    private ArrayList<LineItem> lineItems;

    // Constructor
    public Invoice (ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    // Getters
    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    // Methods
    public void addLineItem (LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public double getTotal () {
        double total = 0;
        for (LineItem lineItem : lineItems) {
            total += lineItem.getTotal();
        }

        return total;
    }
}
