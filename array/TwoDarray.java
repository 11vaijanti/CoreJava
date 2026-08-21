
package array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row = sc.nextInt();
		System.out.println("Enter column");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.println("Enter elements");
				arr[i][j]= sc.nextInt();
			}System.out.println(arr[i]);
		}
		

	}

}
