import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,0,3,2};
        int[] arr2 = {2,0,4};
        int M = 4;
        int N = 3;
        System.out.println(Arrays.toString(multiplyTwoPolynomials(arr1, arr2, M, N)));

    }

    public static int[] multiplyTwoPolynomials(int[] arr1 , int[] arr2 , int M , int N)
    {
        int[] arr = new int[(M+N)-1];
        for(int i = 0 ; i<M ; i++)
        {
            for(int j = 0 ; j<N ; j++)
            {
                arr[i+j] = arr[i+j] + arr1[i] * arr2[j];
            }
        }
        return arr;
    }
}