package lab3;
import java.util.Arrays;
import java.util.Scanner;
import java.*;
public class bubble {
	
	public static void bubbleSort(int []arr) {
		if(arr==null) {
			
		}
		else {
			for (int j=0;j<arr.length;j++) {
	

			for( int i=0;i<arr.length-1;i++) {
				if(arr[i+1]<arr[i]) {
					int k=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=k;
					continue;
				}
			}
		}
			System.out.println(Arrays.toString(arr));

	}
}
	public static void main(String []asd) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int c=sc.nextInt();
		int []arr=new int [c];
		for (int i=0;i<c;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		
	}
	}
