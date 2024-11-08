public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        for (int i = 0; i < 3; i++) {
            order.setId(i); 
            order.getOrderDetails().get(i).setQuantity(2); 
        }

        order.calculateTotal(); 
        order.cetakStruk(); 
    }
}
