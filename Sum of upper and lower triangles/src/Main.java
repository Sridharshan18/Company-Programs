import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{6, 5, 4},
                          {1, 2, 5},
                          {7, 9, 7}};
        int n = 3 ;// 3*3 matrix
        System.out.println(upperandlower(matrix,n));
    }

    public static ArrayList<Integer> upperandlower(int[][] matrix, int n )
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int lowerSum = 0;
        int upperSum = 0;
        for(int i =0 ; i<n; i++)
        {
            for(int j = 0 ; j<n; j++)
            {
                if(i==j)
                {
                    upperSum = upperSum + matrix[i][j];
                    lowerSum = lowerSum + matrix[i][j];
                }
                else if(i<j)
                {
                    upperSum = upperSum + matrix[i][j];
                }
                else
                {
                    lowerSum = lowerSum + matrix[i][j];
                }
            }
        }
        ans.add(upperSum);
        ans.add(lowerSum);
        return ans;
    }
}