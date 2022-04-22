/**
 * This is a point that takes polar coordinates for creation
 * and has getters for 
 */
public class PolarPoint
{
    double radians;
    double radius;
    public PolarPoint(int angle, double radius){
        this.radians = Math.toRadians(angle); 
        this.radius = radius;
    }
    // see https://en.wikipedia.org/wiki/Polar_coordinate_system
    public int getX(){
        return (int)(radius * Math.cos(radians));
    }

    public int getY(){
        return (int)(radius * Math.sin(radians));
    }

}
