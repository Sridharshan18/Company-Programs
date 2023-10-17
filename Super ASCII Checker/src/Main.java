import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(superASCIIChecker(s));

    }

    public static String superASCIIChecker(String s)
    {
        int[] arr = new int[26];
        int n = s.length();
        int index;
        for(int i = 0 ; i<n; i++)
        {
            index = (int)s.charAt(i) - 97;
            arr[index]++;
        }

        for(int i = 0 ; i<n ; i++)
        {
            index = (int) s.charAt(i) - 97;
            if(arr[index]!=index+1)
            {
                return "No";
            }
        }
        return "Yes";
    }
}