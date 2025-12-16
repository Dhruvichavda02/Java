import java.util.*;

public class ComparableEX {
    public static void main(String[] args) {
      ArrayList<Student> list = new ArrayList<>();
      list.add(new Student(1,"Rahul",22));
      list.add(new Student(2,"Rahul",22));
      list.add(new Student(3,"Sneha",20));
      
      Collections.sort(list);
      
      for(Student s :list){
        System.out.println(s.id+" "+s.name+" "+s.age);
      }
      // Java takes one Student object at a time from list
      // Assigns it to variable s
      // Repeats until all elements are visited
  }
}

class Student implements Comparable<Student>{
  int id ;
  String name;
  int age ;
  
  Student(int id,String name,int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }
  public int compareTo(Student s){
    return this.age - s.age;
  }
}