import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(decimalToBinary(n));
    }

    public static int decimalToBinary(int n )
    {
        int ans = 0;
        int factor = 1;
        while (n>0)
        {
            ans = ans + (n%2) *factor;
            factor = factor*10;
            n = n/2;
        }
        return ans;
    }
}