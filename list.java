import java.io.*;
import java.util.*;


public class list {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // BEGINNING MY CODE
        Scanner scanner = new Scanner(System.in);
        int memberNumberOfList = scanner.nextInt();
        LinkedList<Integer> listX = new LinkedList<Integer>();
        for(int i=0; i<memberNumberOfList; i++){
            int memberOfList = scanner.nextInt();
            listX.add(memberOfList);
        }
        int numberOfQueries = scanner.nextInt();
        for(int x=0; x<numberOfQueries; x++){
            scanner.nextLine(); // DUMMY SCANNER
            String query = scanner.nextLine();
            if(query.equals("Insert")){
                int addingIndexNo = scanner.nextInt();
                int addNumber = scanner.nextInt();
                listX.add(addingIndexNo,addNumber);
            }
            else if(query.equals("Delete")){
                int deletingIndexNo = scanner.nextInt();
                listX.remove(deletingIndexNo);
            }
        }
        for(int i=0; i<listX.size(); i++){
            System.out.print(listX.get(i)+" ");
        }
        //EN OF MY CODE
    }
}
