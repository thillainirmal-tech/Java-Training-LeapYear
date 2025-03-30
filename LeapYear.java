public class LeapYear {
 
    public static boolean isLeapYear(int year) {
        // Invalid year range check
        if (year < 1 || year > 9_999) {
            return false;
        }
 
        // Leap year logic
        if (year % 4 == 0) { 
            if (year % 100 != 0) { 
                return true;  // Divisible by 4 but not 100 → Leap year
            } else { 
                return year % 400 == 0;  // Divisible by 400 → Leap year
            }
        } 
        return false;  // Not divisible by 4 → Not a leap year
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isLeapYear(1600));   // Output: true (Leap year)
        System.out.println(isLeapYear(1700));   // Output: false (Not a leap year)
        System.out.println(isLeapYear(2000));   // Output: true (Leap year)
        System.out.println(isLeapYear(2024));   // Output: true (Leap year)
        System.out.println(isLeapYear(2023));   // Output: false (Not a leap year)
        System.out.println(isLeapYear(-100));   // Output: false (Invalid year)
        System.out.println(isLeapYear(10000));  // Output: false (Invalid year)
    }
}
