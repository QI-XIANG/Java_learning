package CH19.circle;

public class calCircle implements Circle {
    public double area(int r) {
        return Math.PI * r * r;
    }
    public double length(int r) {
        return 2 * Math.PI * r;
    }
}
