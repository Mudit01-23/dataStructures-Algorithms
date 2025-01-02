import java.util.Arrays;
public class bubbleSort{
	public static void main(String[] Args){

		int[] array = {5,4,3,2,1};
		System.out.println(Arrays.toString(array));
		bubbleSort(array);	
		System.out.println(Arrays.toString(array));

	}
	
	static void bubbleSort(int[] array){
		boolean swap = true;
		for(int i = 0;i<array.length;i++){
		swap = false;
		for(int j = 0;j<array.length-i-1;j++){
		if(array[j]> array[j+1]){
			int temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;
			swap = true;
			}
		if(swap == false){
		break;		
	}

		}
	
	
		}
	}


}
