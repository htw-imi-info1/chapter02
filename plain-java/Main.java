public class Main {

  public static void main(String[] args){
    System.out.println("Hello World!");
    Date date = new Date(2022,4,22);
    System.out.println(date.format());
    Date date = new Date (2022, 2, 28);
    System.out.println(date.format());
    Date leap = new Date(2000, 2, 7);
    System.out.println(leap.format());
    leap.setDay(29);
    System.out.println(leap.format());
    leap.setYear(2001);
    System.out.println(leap.format());
    Date test = new Date(-2000, 2, 8);
    test.testMethodIsLeapYear();

  }
}
