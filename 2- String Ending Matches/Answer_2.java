/**
 * Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.
 * متدی بنویسید که ۲ رشته در ورودی بگیره و در صورتی که رشته ی اول، با رشته ی دوم به پایان رسیده بود مقدار صحیح برگردونه در غیر این صورت غلط. 
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(checkEnding("abc", "bc"));         // ➞ true

        System.out.println(checkEnding("abc", "d"));          // ➞ false

        System.out.println(checkEnding("samurai", "zi"));     // ➞ false

        System.out.println(checkEnding("feminine", "nine"));  // ➞ true
        
        System.out.println(checkEnding("convention", "tio")); // ➞ false
    }

    public static boolean checkEnding(String first, String second) {
        int firstLength = first.length();
        int secondLength = second.length();

        if (secondLength > firstLength) {
            return false;
        }

        String ending = first.substring(firstLength - secondLength);

        return ending.equals(second);
    }

    /** Java has deffault method for this question :
     * 
    public static boolean checkEnding(String first, String second) {
        return first.endsWith(second);
    }
     */
}