package edu.pnu.shape;
public class Rectangle extends Shape{
    private int width, height;

    public Rectangle(int x1, int y1, int x2, int y2){
        this.width = x2 - x1;
        this.height = y2 - y1;
    }
    @Override
    public float getArea() {
        float area = (float)(width * height);
        return area;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("[Rectangle %d %d %.2f]", width, height, getArea());
    }
}
