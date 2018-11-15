package Naive;

public class _0454_RectangleArea {
    public int width;
    public int height;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    public _0454_RectangleArea(int a, int b) {
        this.width = a;
        this.height = b;
    }

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    public int getArea() {
        return width * height;
    }


    public static void main(String[] args) {
        _0454_RectangleArea rec = new _0454_RectangleArea(3, 4);
        System.out.println(rec.getArea()); // should get 12
    }
}
