enum Day {Monday,Tuesday,Wednesday}

class Enum_Methods_03{
    public static void main(String[] args) {
        // for(Day d : Day.values()){
        //     System.out.println(d);
        // }

        //valueOf() --> Converts String into enum constant
        // Day d = Day.valueOf("Monday");
        // System.out.println(d);

        // oridnal() --> return index position 
        // System.out.println(Day.Monday.ordinal());

        // 🔹 name()
        // 👉 Returns the exact enum constant name.
        
            System.out.println(Day.Monday.name()); //MONDAY

        // 🔹 toString()
        //👉 Returns string representation (default = same as name()).
        // (Can be overridden)
        System.out.println(Day.Monday.toString());


    }
}