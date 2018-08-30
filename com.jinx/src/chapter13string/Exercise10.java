package chapter13string;

public class Exercise10 {

    public static void main(String[] args) {
        String text = "Java now has regular expressions";

        String regex1 = "^Java";
        String regex2 = "\\\\Breg.*";
        System.out.println(text.matches(regex1));
        System.out.println(text.matches(regex2));
    }
}
