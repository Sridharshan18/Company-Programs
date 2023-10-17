import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(removeCharacter(str1,str2));
    }

    public static String removeCharacter(String str1 , String str2)
    {
       int[] arr = new  int[26];
       int index;
       for(int i = 0 ; i<str2.length(); i++)
       {
           index = (int) str2.charAt(i) - 97;
           arr[index]++;
       }

       String result = "";
       for(int i = 0 ; i<str1.length();i++)
       {
           index = (int) str1.charAt(i) - 97;
           if(arr[index]==0)
           {
               result = result + str1.charAt(i);
           }
       }
       return result;
    }
}