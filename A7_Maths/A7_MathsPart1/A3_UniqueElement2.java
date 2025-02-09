public class A3_UniqueElement2 {
    public static void main(String[] args) {
        // here in this array every number contains +ve and -ve, only 1 is unique, find that 

        int[] array= {1,-1,3,-2,4,-3,2};
        System.out.println("The unique element is: " + uniqueElement(array));
    }
    static int uniqueElement(int[] array){
        int sum = 0;
        for(int i =0;i<array.length;i++){
            sum = sum+array[i];
        }
        return sum; 
    }
    
}
