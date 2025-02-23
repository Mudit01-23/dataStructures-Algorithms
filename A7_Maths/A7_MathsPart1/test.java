public class test{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,2,3};
        int uniqueNumber = uniqueNumber(array);
        System.out.println(uniqueNumber);
    }
    static int uniqueNumber(int[] array){
        int uniqueNumber =0;
        for(int i =0;i<array.length;i++){
            uniqueNumber = uniqueNumber^array[i];
        }
        return uniqueNumber;
    }
}