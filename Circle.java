package edu.pnu.shape;
public class Circle extends Shape{
    private Point center;
    private int radius;

    public Circle(Point p, int radius) {
        this.center = new Point(p.getX(), p.getY());
        this.radius = radius;
    }
    @Override
    public float getArea() {
        float area = (float)(Math.PI * radius * radius);
        return area;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("[Circle [%d, %d], radius: %d area: %.2f]", center.getX(), center.getY(), radius, getArea());
    }
}
