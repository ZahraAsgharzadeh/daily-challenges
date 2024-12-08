import java.util.ArrayList;
import java.util.List;

/**
 * Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
 * متدی بنویسید که ۲ عدد از ورودی میگیره و آرایه ای بسازه از مضرب ورودی اول تا وقتی که سایز آرایه به ورودی دوم برسه.  
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(arrayOfMultiples(2, 5));  // -> [2, 4, 6, 8, 10]
        
        System.out.println(arrayOfMultiples(3, 10)); // -> [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]
        
        System.out.println(arrayOfMultiples(6, 1));  // -> [6]
    }

    public static List<Integer> arrayOfMultiples(int num, int length) {
        List<Integer> multiples = new ArrayList<>();

        for (int i = 1; i<= length; i++) {
            multiples.add(num * i);
        }

        return multiples;
    }
}