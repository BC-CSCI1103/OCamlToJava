public interface Line {

  Point getP1();
  Point getP2();

  String toString();

  double length();

  Point midPoint();
  double compareTo(Line other);
  boolean equal(Line other);

  Line move(double dx, double dy);
}
