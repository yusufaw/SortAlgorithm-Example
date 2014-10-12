package insertionSort;

/**
 * @author Yusuf Aji Wibowo
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		int Array[]={9,8,2,6,5,7,1,3,4};
		insertionSort(Array);
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}
	public static void insertionSort(int data[]) {
		int temp;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			int j = i - 1;
			while(data[j] > temp && j >= 0){
				data[j+1] = data[j];
				//data[j]=temp;
				j--;
			}
			//data[j+1] = temp;
		}
	}
}
