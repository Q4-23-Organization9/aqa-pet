package hw7;

public class Task_5 {
    public static void main(String[] args) {

        int[][] twoDimensionArray = {{1, -2, 3}, {-5, 6, 7}, {-8, -9, 10}};
        int counter = 0;
        System.out.println("Negative elements below the main diagonal:");
        for (int i =0; i < twoDimensionArray.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (twoDimensionArray[i][j] < 0 )
                {
                    counter++;
                    System.out.println("[" + i + "]" + "[" + j + "]" + "=" + twoDimensionArray[i][j]);
                }
            }

        }
        System.out.println("Number of elements = " + counter);

        System.out.println("-------------------------------------------------------------------");

        int sum = 0;
        System.out.println("Odd elements above the main diagonal:");
        for (int i =0; i < twoDimensionArray.length; i++)
        {
            for (int j = 0; j < twoDimensionArray[i].length; j++)
            {
                if ( i < j && twoDimensionArray[i][j] % 2 != 0 )
                {
                    sum += twoDimensionArray[i][j];
                    System.out.println("[" + i + "]" + "[" + j + "]" + "=" + twoDimensionArray[i][j]);
                }
            }

        }
        System.out.println("Sum of elements = " + sum);
    }
}
