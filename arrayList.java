/*Input Format
The first line has an integer . In each of the next lines there will be an integer denoting number of integers on that line and then there will be space-separated integers. In the next line there will be an integer denoting number of queries. Each query will consist of two integers and

.

Constraints

Each number will fit in signed integer.
Total number of integers in lines will not cross

.

Output Format
In each line, output the number located in
position of

line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!
*/
import java.io.*;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    //BEGINNING MY CODE
    Scanner scanner = new Scanner(System.in);

    int satir = scanner.nextInt();
    ArrayList[] arrayList = new ArrayList[satir];
    for(int m=0; m<satir; m++){
        int sutun = scanner.nextInt();
        arrayList[m] = new ArrayList();
        arrayList[m].add(sutun);
        for(int k=0; k<sutun; k++){
            arrayList[m].add(scanner.nextInt());
        }
    }
    int satirIki = scanner.nextInt();

    for(int m=0; m<satirIki; m++){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        try{
            System.out.println(arrayList[x-1].get(y));
        }
        catch(Exception e){
            System.out.println("ERROR!");
        }
    }
    //END OF MY CODE
}
}
