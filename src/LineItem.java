public class LineItem {
    private Product product;

    private int quantity;

    // Constructor
    public LineItem (Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters
    public Product getProduct () {
        return product;
    }

    public int getQuantity () {
        return quantity;
    }

    // Methods
    public double getTotal () {
        return (quantity * product.getUnitPrice());
    }
}
