import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(replace0With5(n));
    }

    public static int replace0With5(int n)
    {
        int copy = n;
        int powerValue = 1;
        while(n>0)
        {
            int digit = n%10;
            if(digit==0)
            {
                copy = copy + powerValue *5;
            }
            powerValue = powerValue *10;
            n = n/10;
        }
        return copy;
    }
}