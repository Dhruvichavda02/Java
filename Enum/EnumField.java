enum Order{
    Placed(1,"Orderplaced"),
    Shipped(2,"Order Shipped"),
    DELIVERED(3, "Order delivered"),
    CANCELLED(4, "Order cancelled");

    // field
    int code;
    String message;

    //constructor -- by default Private order
     Order(int code,String message) {
            this.code = code;
            this.message = message;
    }
}

class EnumField{
    public static void main(String[] args) {
        Order status = Order.Shipped;
        System.out.println(status.code);
        System.out.println(status.message);

    }
}
// Enum constructors are private by default
// You cannot create enum objects using new
// Fields belong to each enum constant