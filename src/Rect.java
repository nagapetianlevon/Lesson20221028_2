public class Rect {
    public int width;
    public int height;


    public Rect() {
    }

    public Rect(int i, int i1) {
        this.width = i;
        this.height = i1;
    }

    public double getDifArea(int w, int h){

        return this.width * this.height - w*h;
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
