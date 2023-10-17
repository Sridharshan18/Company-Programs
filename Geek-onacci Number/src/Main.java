import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long a,b,c,N;
        for(int i = 0 ; i<n ; i++)
        {
             a = scanner.nextLong();
             b=scanner.nextLong();
             c= scanner.nextLong();
             N = scanner.nextLong();
            System.out.println(GeekonacciNumber(a,b,c,N));
        }
    }

    public static long GeekonacciNumber (long a, long b, long c, long N )
    {
        long sum =0;
        int count =3;
        while(count<N)
        {
            sum = a+b+c;
            a=b;
            b=c;
            c=sum;
            count++;
        }

        return sum;

    }
}