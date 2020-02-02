/*We define the following:

    A subarray of an

-element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like

    would not be a subarray as it's not a contiguous subsection of the original array.
    The sum of an array is the total sum of its elements.
        An array's sum is negative if the total sum of its elements is negative.
        An array's sum is positive if the total sum of its elements is positive.

Given an array of

integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer,
, denoting the length of array .
The second line contains space-separated integers describing each respective element, , in array

.

Constraints

Output Format

Print the number of subarrays of

having negative sums.

Sample Input

5
1 -2 4 -5 1

Sample Output

9

Explanation

There are nine negative subarrays of

:

Thus, we print on a new line.*/
import java.io.*;
import java.util.*;
public class subArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // MY CODE
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int negativeSum = 0;

        for(int x=0; x<a.length; x++){
            a[x] = scanner.nextInt();
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i<=j){
                    int[] b = Arrays.copyOfRange(a,i,j+1);
                    int sumX = 0;
                    for(int k=0; k<b.length; k++){
                        sumX += b[k];
                    }
                    if (sumX <0){
                        //System.out.print(sumX+" ");
                        negativeSum += 1;
                    }
                }

            }
        }
        System.out.print(negativeSum);
        //END OF MY CODE
    }
}
