import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderDetail> orderDetails = new ArrayList<>();
    private double totalAmount;

    // Menambahkan OrderDetail ke dalam daftar
    public void setId(int id) {
        orderDetails.add(new OrderDetail(id));
    }

    // Getter untuk orderDetails
    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    // Menghitung total keseluruhan pesanan
    public void calculateTotal() {
        totalAmount = 0;
        for (OrderDetail detail : orderDetails) {
            totalAmount += detail.subTotal();
        }
    }

    // Mengembalikan total pesanan
    public double getTotalAmount() {
        return totalAmount;
    }

    // Metode untuk mencetak struk
    public void cetakStruk() {
        System.out.println("Struk: ");
        for (OrderDetail detail : orderDetails) {
            System.out.println(detail.loadData());
        }
        System.out.println("Total: " + totalAmount);
        // Memanggil Printer untuk mencetak struk
        Printer.cetak("Struk dicetak dengan total: " + totalAmount);
    }
}
