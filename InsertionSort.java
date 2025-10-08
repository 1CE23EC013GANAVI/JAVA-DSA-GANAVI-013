//Insertion Sort is to pick the element in the unsorted part nd place it in the right position in the sorted part.
//5 4 1 3 2 = Input
//4 5 1 3 2
//1 4 5 3 2
//1 3 4 5 2
//1 2 3 4 5 = Result


package Com;
import java.util.Arrays;
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {5,4,1,3,2};
		System.out.println("Unsorted Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Sorted Array");
		Insertionsort(arr);
		System.out.println(Arrays.toString(arr));}
		
		public static void Insertionsort(int arr[]) {
			for(int i=0;i<arr.length;i++)
			{
				int curr = arr[i];
				int prev = i-1;
				while(prev>=0 && arr[prev]>curr) {
					arr[prev+1] = arr[prev];
					prev--;
				}
				arr[prev+1]=curr;
		}
		}}
			
			
			
			
			
			
			
			
			
			