
public class DayOfProgrammerSolution {
	 // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    	if (year == 1918)
            return "26.09.1918";
    	if(isLeapYear(year))
            return "12.09." + year;
        else
            return "13.09." + year;
    }
    
    static boolean isLeapYear(int year) {                
        if(year < 1918 && year%4==0)
        	return true;
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    
    public static void main(String []args) {
    	System.out.print(dayOfProgrammer(2016));
    }
}
