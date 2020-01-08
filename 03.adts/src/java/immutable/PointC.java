// file: PointC.java
// author: Bob Muller
// date: January 2020
//
// An implementation of the Point type.
//
public class PointC implements Point {

    private double x;
    private double y;

    // A constructor of Points.
    //
    public PointC(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // A static factory method. We'll come back to this later!
    public static Point make(double x, double y) {
        return new PointC(x, y);
    }

    public String toString() { return "(" + x + ", " + y + ")"; }

    // Getters.
    //
    public double getX() { return this.x; }
    public double getY() { return this.y; }

    public double compareTo(Point other) {
        double xAnswer = this.getX() - other.getX();
        if (xAnswer != 0.0)
            return xAnswer;
        else
            return this.getY() - other.getY();
    }

  public boolean equal(Point other) {
    return compareTo(other) == 0;
  }

  public Point move(double dx, double dy) {
    return new PointC(this.x + dx, this.y + dy);
  }

  // Unit testing
  //
  public static void main(String[] args) {
    Point p1 = new PointC(2.0, 3.0);
    System.out.println("p1 = " + p1.toString());
    Point p2 = p1.move(1.0, 1.0);
    System.out.println("p2 = " + p2.toString());
    }
}
