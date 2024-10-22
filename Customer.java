public record Customer(String name, String address, String email, String phoneNumber) {
    public Customer {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email không hợp lệ");
        }
        if (phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Số điện thoại phải có 10 chữ số");
        }
    }
}
