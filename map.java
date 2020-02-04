/*You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer

denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.



Output Format

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output

uncle sam=99912222
Not found
harry=12299933
*/

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class map {
    public static void main(String []argh)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        //BEGINNING MY CODE
        TreeMap<String,Integer> phoneList = new TreeMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            String name=scanner.nextLine();
            int phone=scanner.nextInt();
            scanner.nextLine();
            phoneList.put(name,phone);
        }


        while(scanner.hasNext())
        {
            String s=scanner.nextLine();
            if(phoneList.containsKey(s)){
                System.out.println(s+"="+phoneList.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        //END OF MY CODE
    }
}
