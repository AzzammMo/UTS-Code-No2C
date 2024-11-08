public class OrderDetail {
    private int id;
    private int quantity;
    private double price;
    private Product product;

    public OrderDetail(int id) {
        this.id = id;
        this.product = new Product();
        this.price = product.getPrice(id);
    }

    public void setQuantity(int qty) {
        this.quantity = qty;
    }

    public double subTotal() {
        return quantity * price;
    }

    public String loadData() {
        return "Produk ID: " + id + ", Kuantitas: " + quantity + ", Subtotal: " + subTotal();
    }
}
