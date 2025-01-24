import java.util.ArrayList;
public class A9_ListOfArmstrongNumbers {
    public static void main(String[] args) {
        // print the list of all 3 digit armstrong numbers;
        ArrayList<Integer> list = listOfArmstrongNumbers();
        System.out.println("List of all 3 digit armstrong numbers are :"+list);
       
    }
    static ArrayList<Integer> listOfArmstrongNumbers(){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 100;i<1000; i++){
            int num = i;
            int sum = 0;
            while(num>0){
                int currentDigit = num%10;
                sum = sum +(currentDigit*currentDigit*currentDigit);
                num = num/10;
            }
            if(sum==i){
                list.add(i);
            }
            
        }

        return list;
    }
}
