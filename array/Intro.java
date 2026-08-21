package array;

public class Intro {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		System.out.println(arr1);//will print address of array
		
		double[] arr2 = {1.0, 2.0};
		System.out.println(arr2); //will print address of an array
		
		char[] arr3 = {'a', 'b','c'};
		System.out.println(arr3); //will print data present in an array, this will happen only in case of char
		System.out.println();
		//creating copy of an array
		int[]arr4 = {1,2,3,4};
		int[] arr5 = arr4;
		arr5[1] = 200;
		System.out.println(arr4[1]);
	}

}
