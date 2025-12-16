enum OrderStatus{
    Placed,
    Shipped,
    Delivered,
    Cancelled
}

public  class Enum{
    public  static  void main(String[] args){
        OrderStatus status = OrderStatus.Shipped;

        if(status == OrderStatus.Shipped) System.out.println("Shipped");
        else if (status == OrderStatus.Shipped)  System.out.println("Order is shipped");
        else {
            System.out.println("Order cancelled");
        }
    }
}