/*You are given a

2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly
lines, each containing integers seperated by spaces. Each integer will be between and

inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19

Explanation

The hourglass which has the largest sum is:

2 4 4
  2
1 2 4
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class java2Darray {
    //BEGINNING MY CODE
    //Yazdığım kod kısa ve efektif olmadığı için discussion kısmından okuduklarım
    //doğrultusunda bu alanı yazmaya çalıştım.
    public static void findLargestHourGlass(int[][] arrayX){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if(i>1 && j>1){
                    int sum = arrayX[i][j]+
                            arrayX[i][j-1]+
                            arrayX[i][j-2]+
                            arrayX[i-1][j-1]+
                            arrayX[i-2][j]+
                            arrayX[i-2][j-1]+
                            arrayX[i-2][j-2];
                    if(sum>maxSum){
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.print(maxSum);
    }
    //END OF MY CODE

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        findLargestHourGlass(arr);
        scanner.close();
    }
}
