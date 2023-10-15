import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(armstrongNumber(n));
    }

    public static String armstrongNumber( int n )
    {
        int copy = n;
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum = sum + (int)Math.pow(digit,3);
            n = n/10;
        }
        if(sum == copy)
        {
            return "Yes it is Armstrong number";
        }
        return "Not a Armstrong number";
    }
}