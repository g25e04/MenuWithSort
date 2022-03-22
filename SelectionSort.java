package summer029;

	

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}

	public int[] SelectionSortNumber(int array[]) {
			for(int i = 0; i < array.length - 1; i++) {
				int m = i;
			for(int j = i + 1; j < array.length; j++){
			if(array[j] < array[m]) m = j;
						}
			if(i != m){
				int temp = array[i];
			    array[i] = array[m];
			    array[m] = temp;
			       }		
			}
			return array;
	}
	
	public char[] SelectionSortChar(char array[]) {
		for(int i = 0; i < array.length - 1; i++) {
			int m = i;
		for(int j = i + 1; j < array.length; j++){
		if(array[j] < array[m]) m = j;
					}
		if(i != m){
			char temp = array[i];
		    array[i] = array[m];
		    array[m] = temp;
		       }		
		}
		return array;
}
}
