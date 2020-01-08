(* file: Hello3.java
   author: Bob Muller

   CSCI 1103 Computer Science 1 Honors

   This is Java code illustrating a very simple service object.
*)
public class Hello3 {

  String first;          // instance variables
  String last;

  // Constructor
  public Hello3(String first, String last) {
    this.first = first;
    this.last = last;
  }

  public void sayHello() {
    String greeting = String.format("Hello %s %s!", this.first, this.last);
    System.out.println(greeting);
  }

  public static void main(String[] args) {
    if (args.length == 2) {
      Hello3 greeter = new Hello3(args[0], args[1]);
      greeter.sayHello();
    }
    else
      System.out.println("Hello World!");
  }
}
