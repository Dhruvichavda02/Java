enum Operation{

      ADD {
        public int apply(int a, int b) {
            return a + b;
        }
    },
    Substract{
        public int apply(int a,int b){
            return a - b;
        }
    };

    public abstract int apply(int a,int b);
}

class Enum_abstractMethod_05{
    public static void main(String[] args) {
        Operation op = Operation.Substract;
        System.out.println(op.apply(4,3));

        int sum = Operation.ADD.apply(3,4);
        int res = Operation.Substract.apply(5,1) + sum;
        System.out.println(res);
        
    }
}