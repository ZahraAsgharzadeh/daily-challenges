/**
 * Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.
 * متدی بنویسید که یک رشته از نام و نام خانوادگی میگیره و اون رو برعکس میکنه. نکته هم اینه که حتما با فاصله از هم جدا میشن
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(shuffle("Donald Trump"));     // Trump Donald
        System.out.println(shuffle("Rosie O'Donnell"));  // O'Donnell Rosie
        System.out.println(shuffle("Seymour Butts"));    // Butts Seymour
    }

    public static String shuffle(String name) {

        String[] nameParts = name.split(" ");
        return nameParts[1] + " " + nameParts[0];
    }
}