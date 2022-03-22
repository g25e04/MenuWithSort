package summer029;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public int[] BubbleSortNumber(int[] a){
		int temp = 0; 
	for (int i = a.length - 1; i > 0; --i){ 
		//每次迴圈執行比較陣列長度-1-迴圈次數 
	for (int j = 0; j < i; ++j){ 
		//交換位置 
	if (a[j + 1] < a[j]){ 
		temp = a[j]; 
		a[j] = a[j + 1]; 
		a[j + 1] = temp; 
			}
		}
	}
	return a;
}
	
	public char[] BubbleSortChar(char[] a){
		char temp; 
	for (int i = a.length - 1; i > 0; --i){ 
		//每次迴圈執行比較陣列長度-1-迴圈次數 
	for (int j = 0; j < i; ++j){ 
		//交換位置 
	if (a[j + 1] < a[j]){ 
		temp = a[j]; 
		a[j] = a[j + 1]; 
		a[j + 1] = temp; 
			}
		}
	}
	return a;
}
}
