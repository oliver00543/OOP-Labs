public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager tm = new TriangleManager(true);

        Triangle t1 = new EquilateralTriangle(4.0);
        Triangle t2 = new RightTriangle(3.0, 4.0, 5.0);
        Triangle t3 = new EquilateralTriangle(6.0);

        tm.addTriangle(t1);
        tm.addTriangle(t2);
        tm.addTriangle(t3);

        Triangle largest = tm.findTriangleWithLargestPerimeter();
        System.out.println("Largest perimeter: " + largest.getPerimeter());

        try {
            tm.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
