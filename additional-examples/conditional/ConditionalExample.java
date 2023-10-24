
/**
 * Write a description of class ConditionalExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConditionalExample
{
    public void example01(boolean condition){
        System.out.println("before conditional");
        if (condition){
            System.out.println("if-part: condition was true!");
        }
        else {
            System.out.println("else-part: condition was false!");
        }
        System.out.println("after conditional");
    }

    public void example02(boolean condition){
        System.out.println("before conditional");
        if (condition){
            System.out.println("if-part: condition was true!");
        }
        System.out.println("after conditional");
    }

    public void example03_even(int number){
        System.out.println("before conditional");
        if (number % 2 == 0){
            System.out.println("if-part: number is even!");
        }
        else {
            System.out.println("else-part: number is not even!");
        }
        System.out.println("after conditional");
    }

    public void example04(){
        int count = 42;
        System.out.println("before conditional - count is: " + count);
        if (count > 10){
            System.out.println("if-part: count is greater than 10!");
        }
        else {
            System.out.println("else-part: count is less than or equal to 10!");
        }
        System.out.println("after conditional");
    }

    public boolean validGrade01(int points){
        if (points > 0 && points < 109){
            return true;
        } else {
            return false;
        }
    }

    public boolean validGrade(int points){
        return (points > 0 && points < 109);
    }
    private int points = 0;
    public void setPoints01(int newPoints){
        if(validGrade(newPoints)){
            this.points = newPoints; 
        } 
    }
    
    public void setPoints(int newPoints){
        if(newPoints > 0){
            points = newPoints; 
        }
    }
}
