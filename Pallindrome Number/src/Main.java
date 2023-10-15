import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(pallindromeNumber(n));
    }

    public static String pallindromeNumber(int n )
    {
        int copy = n;
        int rev = 0;
        while(n>0)
        {
            rev = (n%10) + (rev*10);
            n = n/10;
        }

        if(copy == rev)
        {
            return "Yes Pallindrome";
        }
        return "No Pallindrome";
    }
}