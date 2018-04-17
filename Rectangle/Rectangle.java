
/**
 * Write a description of class Rectangle here.
 *
 */
public class Rectangle
{
    private int height = 0, width = 0;
    public Rectangle(int initialHeight, int initialWidth){
        height = initialHeight;
        width = initialWidth;
    }

    public int getArea(){
        int area = height * width;
        return area;
    }
}
