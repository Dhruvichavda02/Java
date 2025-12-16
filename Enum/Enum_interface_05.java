interface Payments{
    double pay(double amount);
}

enum PayMode implements Payments{
    cash{
        public double pay(double amount){
            return amount;
        }
    },
    card{
        public double pay(double amount){
            return amount + 20;
        }
    },
     UPI{
        public double pay(double amount){
            return amount + 5;
        }
    }
}

class  Enum_interface_05{
    public static void main(String[] args) {
        PayMode play = PayMode.UPI;
        double finalAmt = play.pay(100);
        System.out.println(finalAmt);
    }
}