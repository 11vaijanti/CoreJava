package array;

public class FindKey {

	public static void main(String[] args) {
		//key = 15
		int[] arr = {8,82,37,3,15};
		int key = 15;
		boolean isPresent = false;
		for(int i= 0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println(i);
				isPresent = true;
			}
		}
		if(!isPresent) {
			System.out.println(-1); //......if not present then return -1
		}

	}

}
