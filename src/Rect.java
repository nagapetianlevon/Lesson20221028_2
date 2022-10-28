public class Rect {
    public int width;
    public int height;

    public double getArea(){
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(width + height);
    }
    public void printArea(){
        System.out.println(getArea());
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                '}' + "\nArea=" + getArea() + "\nPerimeter" + getPerimeter();
    }
}
