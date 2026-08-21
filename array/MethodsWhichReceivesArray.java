package array;

import java.util.Arrays;

public class MethodsWhichReceivesArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] newcopy = copy(arr); //...storing method inside a variable
		System.out.println(Arrays.toString(newcopy));
		System.out.println(Arrays.toString(arr));

	}
	public static int[] copy(int[]a) {
		int[]newArray = new int[a.length];
		for(int i = 0; i<a.length;i++) {
			newArray[i] = a[i];
		}
		return newArray;
	}

}
