
enum OrderStatus{
    Placed,
    Shipped,
    Delivered,
    Cancelled
}
public class Enum_02{
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.Placed;
        
        for(OrderStatus s : OrderStatus.values()){
                        System.out.println("Status: " + s);

        }


    }

}   