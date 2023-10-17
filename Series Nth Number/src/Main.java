import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(seriesNthNumber(n));
    }

    public static int seriesNthNumber(int n)
    {
        int a = 1;
        int r;
        int k ;
        if(n%2==0)
        {
             r = 3;
             k = n/2;
            return (int) (a*Math.pow(r,k-1));
        }
        else
        {
            r= 2;
            k = n/2+1;
            return (int) (a*Math.pow(r,k-1));
        }
    }
}