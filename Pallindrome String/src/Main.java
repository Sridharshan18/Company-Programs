import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(pallindromeString(s));

    }

    public static String pallindromeString(String s)
    {
        int len = s.length()-1;
        String word2 = "";
        for(int i =len; i>=0;i--)
        {
            word2 = word2 + s.charAt(i);
        }
        if(s.equals(word2))
        {
            return "Yes it is a Pallindrome String";
        }
        return "Not a Pallindrome";
    }
}