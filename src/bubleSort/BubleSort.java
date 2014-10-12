package bubleSort;


/**
 * @author Yusuf Aji Wibowo
 *
 */
public class BubleSort {
	public static void main(String[] args) {
		//Scanner input=new Scanner(System.in);
		int Array[]={9,8,2,6,5,7,1,3,4};
		bubleSort(Array);
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}
	public static void bubleSort(int data[]) {
		for (int i = 1; i < data.length; i++) {
			for (int j = data.length-1; j >= i; j--) {
				if(data[j]<data[j-1]){
					int temp=data[j-1];
					data[j-1]=data[j];
					data[j]=temp;
				}
			}
			
		}
	}
}

