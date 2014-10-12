package cocktailSort;

/**
 * @author Yusuf Aji Wibowo
 *
 */
public class CockTail {
	public static void main(String[] args) {
		int Array[]={9,8,2,6,5,7,1,3,4};
		System.out.print("Data sebelum disorting : ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		cockTail(Array);
		System.out.print("Data setelah disorting : ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
	}
	public static void cockTail(int data[]){
		boolean tukar = false;
		do{
			//tukar = false;
			for (int i = 0; i < data.length-1; i++)
			 {
				if(data[i] > data[i+1]){
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
					tukar = true;
				}
			}
			if(tukar == false){
				break;
			}
			else{
			tukar = false;
			for (int i =  data.length - 1; i <0; i--) {
				if (data[i] > data[i+1]){
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
					tukar = true;
				}
				
			}
			}
			
		}while(true);
		
	}
}

