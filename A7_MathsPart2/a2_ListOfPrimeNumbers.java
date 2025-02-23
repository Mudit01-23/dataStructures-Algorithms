
import java.util.ArrayList;
import java.util.Scanner;


public class a2_ListOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end range: ");
        int end = sc.nextInt();
        ArrayList<Integer> list = primeList(start,end);
        System.out.println(list);
    }
    static ArrayList<Integer> primeList(int start,int end){
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =start;i<=end;i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                list.add(i);
            }
            }
            return list;
        }

        static boolean isPrime(int n){
            for(int i =2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }

                
            }
            return true;
        }
        
    }

