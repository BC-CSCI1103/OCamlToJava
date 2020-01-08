public class Hello2 {
  public static void main(String[] args) {
    if (args.length == 2) {
      String greeting = String.format("Hello %s %s!", args[0], args[1]);
      System.out.println(greeting);
    }
    else
      System.out.println("Hello World!");
  }
}
