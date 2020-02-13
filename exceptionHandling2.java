/*You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int).
        Input Format

        Each line of the input contains two integers,
        and

        . The locked stub code in the editor reads the input and sends the values to the method as parameters.

        Constraints

        Output Format

        Each line of the output contains the result
        , if both and are positive. If either or is negative, the output contains "n and p should be non-negative". If both and

        are zero, the output contains "n and p should not be zero.". This is printed by the locked stub code in the editor.

        Sample Input 0

        3 5
        2 4
        0 0
        -1 -2
        -1 3

        Sample Output 0

        243
        16
        java.lang.Exception: n and p should not be zero.
        java.lang.Exception: n or p should not be negative.
        java.lang.Exception: n or p should not be negative.

        Explanation 0

        In the first two cases, both

        and
        are postive. So, the power function returns the answer correctly.
        In the third case, both
        and
        are zero. So, the exception, "n and p should not be zero.", is printed.
        In the last two cases, at least one out of
        and is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.*/

import java.util.Scanner;

class YourCalculator{
    //BEGINNING OF MY CODE

    public int power(int x, int y) throws Exception {

        if(x==0 && y==0){
            throw new Exception ("n and p should not be zero.");
        }
        else if(x<0 || y<0){
            throw new Exception ("n or p should not be negative.");
        }
        else{
            double sonuc = Math.pow(x,y);
            return (int)sonuc;
        }
    }
    //END OF MY CODE

}

public class exceptionHandling2 {
    public static final YourCalculator my_calculator = new YourCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}