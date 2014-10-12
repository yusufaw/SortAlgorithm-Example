package gnomeSort;

/**
 * @author Yusuf Aji Wibowo
 *
 */
public class GnomeSort {
	public static void main(String[] args) {
		int Array[]={9,8,2,6,5,7,1,3,4};
		System.out.print("Data sebelum disorting : ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		gnomeSort(Array);
		System.out.print("Data setelah disorting : ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
	}
	public static void gnomeSort(int data[]) {
		int pos = 1;
		int temp;
		while(pos < data.length){
			if (data[pos] >= data[pos-1])
				pos=pos+1;
			else{
				temp=data[pos-1];
				data[pos-1]=data[pos];
				data[pos]=temp;
				if(pos > 1){
					pos=pos-1;
				}
				else{
					pos=pos+1;
				}
			}
				
		}
	}
}
