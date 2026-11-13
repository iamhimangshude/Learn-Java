public sealed class Shape permits Circle, Rectangle, Square {
    public abstract double area();
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

non-sealed class Rectangle extends Shape {
    private final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height
    }
}

sealed class Square extends Shape permits FilledSquare {
    protected final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

final class FilledSquare extends Square {
    public FilledSquare(double side) {
        super(side);
    }
}