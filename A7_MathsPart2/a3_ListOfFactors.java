
import java.util.ArrayList;
import java.util.Scanner;

public class a3_ListOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = findFactorsList(n);
        System.out.println(list);
    }

    static ArrayList<Integer> findFactorsList(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i*i<=n;i++){
          if(n%i==0){
            list.add(i);
          }
        }
        list.add(n);
        return list;
        
    }
   
}
