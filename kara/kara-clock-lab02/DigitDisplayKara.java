import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This will be one Digit in the KaraClock
 */
public class DigitDisplayKara extends Kara
{

    public void act()
    {
    }

    public int moveUpAndCount(){
        return -1; // has to return something to compile
    }

    public void turnAround(){turnLeft();turnLeft();}

    public void multiMove(int n){

        if(n<0){
            turnAround();
            int i=0;
            while(i>n){
                move();
                i--;
            }
            turnAround();
        } else {
            int i=0;
            while(i<n){
                move();
                i++;
            }
        }
    }
}
