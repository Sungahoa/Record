import java.time.LocalDateTime;

public record Order(Customer customer, Product product, int quantity, float totalAmount, LocalDateTime orderTime) {
    public Order {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Số lượng phải lớn hơn 0");
        }
        if (totalAmount <= 0) {
            throw new IllegalArgumentException("Tổng tiền phải lớn hơn 0");
        }
        if (product.stockQuantity() < quantity) {
            throw new IllegalArgumentException("Sản phẩm không đủ số lượng trong kho");
        }
    }

    public static Order createOrder(Customer customer, Product product, int quantity) {
        float totalAmount = product.price() * quantity;
        LocalDateTime orderTime = LocalDateTime.now();
        return new Order(customer, product, quantity, totalAmount, orderTime);
    }
}
