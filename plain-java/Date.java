public class Date{
  private int day, month, year;

  public Date(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Please enter a valid date.");
        }
  }
  
  public void setDay(int day) {
        if (isValidDate(this.year, this.month, day)) {
            this.day = day;
        } else {
            System.out.println(this.year+"."+this.month+"."+day+" is not a valid date.");
        }
  }

  public void setMonth(int month) {
        if (isValidDate(this.year, month, this.day)) {
            this.month = month;
        } else {
            System.out.println(this.year+"."+month+"."+this.day+" is not a valid date.");
        }
  }

  public void setYear(int year) {
        if (isValidDate(year, this.month, this.day)) {
            this.year = year;
        } else {
            System.out.println(year+"."+this.month+"."+this.day+" is not a valid date.");
        }
  }
  
  public int getYear() {
        return year;
  }

  public int getMonth() {
        return month;
  }

  public int getDay() {
        return day;
  }
  
 //Checks whether a date is plausible. Accounts for leap years.
  private boolean isValidDate(int year, int month, int day) {
        if (year > 0) {
            if (month == 2) {
                if ((isLeapYear(year) && 1 <= day && day <= 29)
                        || (!isLeapYear(year) && 1 <= day && day <= 28)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if ((1 <= day && day <= 31 && month == 1 || month == 3 || month == 5
                        || month == 7 || month == 8 || month == 10 || month == 12)
                        || (1 <= day && day <= 30 && month == 4 || month == 6 || month == 9
                        || month == 11)) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
  }


  //Checks whether a year is a leap year.
  private boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
  }
  
  public String format(){

    return ""+day+"."+month+"."+year;
  }
}
