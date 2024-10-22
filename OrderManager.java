import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Đơn hàng đã được thêm thành công");
    }

    public void showAllOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Nguyễn Văn A", "Hà Nội", "nguyenvana@gmail.com", "0987654321");
        Product product = new Product("P001", "Laptop", 15000.0f, 10);
        Order order = Order.createOrder(customer, product, 2);

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(order);

        orderManager.showAllOrders();
    }
}
