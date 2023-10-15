import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(prime(n));
    }

    public static String prime(int n)
    {
        if(n<=1)
        {
            return "Not a Prime number";
        }
        for(int i = 2 ; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return "Not a Prime Number";
            }
        }
        return "Prime number";
    }
}