(* file: Hello4.java
   author: Bob Muller

   CSCI 1103 Computer Science 1 Honors

   This is Java code illustrating a very simple service object. 
*)
public class Hello4 {

  String first;          // instance variables
  String last;

  // Constructor
  public Hello4(String first, String last) {
    this.first = first;
    this.last = last;
  }

  public void sayHello() {
    // public void sayHello(Hello4 this) {
    String greeting = String.format("Hello %s %s!", this.first, this.last);
    System.out.println(greeting);
  }

  public static void main(String[] args) {
    if (args.length == 2) {
      Hello4 greeter1 = new Hello4(args[0], args[1]);
      Hello4 greeter2 = new Hello4(args[1], args[0]);
      greeter1.sayHello();
      // greeter1.sayHello(greeter1);
      greeter2.sayHello();
      // greeter2.sayHello(greeter2);
    }
    else
      System.out.println("Hello World!");
  }
}
