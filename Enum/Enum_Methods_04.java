enum OrderStatus{
    Placed,Shipped,Deliverd;

    public boolean isFinal(){
        return this == Deliverd;
    }
}

enum Level{
    Low(1),Medium(2),High(3);
    int code; // field
    Level(int code){
        this.code = code;
    }
    //method
    public int getCode(){
        return code;
    }
}

class Enum_Methods_04{
    public  static void main (String[] args){
        OrderStatus status = OrderStatus.Deliverd;
        System.out.println(status.isFinal());

        System.out.println(Level.High.getCode()); //3 
    }
}