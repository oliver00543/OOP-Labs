public interface Triangle {
    double getLongestSideLength();
    double getPerimeter();
    double getLargestAngle();
}

class EquilateralTriangle implements Triangle {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getLongestSideLength() {
        return side;
    }

    public double getLargestAngle() {
        return 60.0;
    }

    public double getPerimeter() {
        return side * 3;
    }
}

class RightTriangle implements Triangle {
    private double side1, side2, side3;

    public RightTriangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getLongestSideLength() {
        return Math.max(side1, Math.max(side2, side3));
    }

    public double getLargestAngle() {
        return 90.0;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
