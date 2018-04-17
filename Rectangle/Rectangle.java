
/**
 * Write a description of class Rectangle here.
 *
 */
public class Rectangle
{
    private int height = 0, width = 0;
    public Rectangle(int height, int initialWidth){
        this.height = height;
        width = initialWidth;
    }

    public int getArea(){
        return height * width;
    }
}
