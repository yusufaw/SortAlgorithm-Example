package selectionSort;

/**
 * @author Yusuf Aji Wibowo
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		int Array[]={9,8,2,6,5,7,1,3,4};
		selectionSort(Array);
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
	}
	public static void selectionSort(int data[]){
		int pos;
		for (int i = 0; i < data.length; i++) {
			pos = i;
			for (int j = i+1; j < data.length; j++) {
				if(data[j] < data[pos])
					pos = j;
			}
			if(pos!=i){
				int temp=data[pos];
				data[pos]=data[i];
				data[i]=temp;
			}
		}
	}
}
