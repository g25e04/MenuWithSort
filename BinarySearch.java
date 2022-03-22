package summer029;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	
	public int binarySearchNumber(int [] a, int key) {
		int low = 0;
		int high = a.length-1;
		while(high>=low) {
			int mid = (low+high)/2;
			if(key<a[mid])
				high=mid-1;
			else if(key==a[mid])
				return mid;
			else
				low = mid+1;
		}
		return -low-1; //沒找到
	}
	
	public int binarySearchChar(char [] a, char key) {
		int low = 0;
		int high = a.length-1;
		while(high>=low) {
			int mid = (low+high)/2;
			if(key<a[mid])
				high=mid-1;
			else if(key==a[mid])
				return mid;
			else
				low = mid+1;
		}
		return -low-1; //沒找到
	}
}
