package summer029;

public class LinearSearch {

	public LinearSearch() {
		// TODO Auto-generated constructor stub
	}

	
	public int linearSearchNumber(int [] a , int key) {
		for(int i=0;i<a.length;i++) {
			if(key == a[i])
				return i;
		}
		return -1; //沒找到
	}
	
	public int linearSearchChar(char [] a , char key) {
		for(int i=0;i<a.length;i++) {
			if(key == a[i])
				return i;
		}
		return -1; //沒找到
	}
}
