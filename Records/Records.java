// class Person {
//     private final String name;
//     private final int age;

//     public Person(String name,int age){
//         this.name = name;
//         this.age = age;
//     }

//     public String getName(){
//         return  name;
//     }
//     public int getAge(){
//         return age;
//     }

// @Override
//  public String toString(){
//         return "Person{name='" + name + "', age=" + age + "}";
//  }
// @Override
//     public boolean equals(Object o ){
//         if(this == o) return true;
//         // Are both objects created from the exact same class?
//         if(o==null || getClass() != o.getClass()) return false;

//         Person person = (Person) o;
//         return age == person.age && name.equals(person.name);
//         // Converts Object o into Person Called type casting.➡ Object does NOT have age or name
//         // I am sure o is actually a Person, so treat it as a Person
//     }


//     @Override
//     public int hashCode(){
//         return name.hashCode() + age;
//     }




// }

record  Person(String name,int age){}
class Records {
    public static void main(String[] args) {
        Person p1 = new Person("Amit",30);
        Person p2 = new Person("Amit",30);
        
        // without 
        // System.out.println(p1.getName());  // Amit
        // System.out.println(p1.equals(p2)); // true
        // System.out.println(p1.toString());

        //with 
        System.out.println(p1.name());   // Amit
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1);
    }
}