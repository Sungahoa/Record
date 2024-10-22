public record Product(String productID, String name, float price, int stockQuantity) {
    public Product {
        if (price < 0) {
            throw new IllegalArgumentException("Giá sản phẩm không thể âm");
        }
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Số lượng sản phẩm trong kho không thể âm");
        }
    }
}
