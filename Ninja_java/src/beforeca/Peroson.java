// package beforeca;
class Main{
  int age = 21;
  int Weight= 56;
  String color = "Lighit";

  void eat(){
    System.out.println("I am eating");

  }
  void sleep(){
    System.out.println( "I am Sleeping");
  }
  
  public static void main(String[]args){
    Person p = new Person();
    System.out.println(p.age);
    System.out.println(p.Weight);
    System.out.println(p.color);

    p.eat(); p.sleep();

  }

}