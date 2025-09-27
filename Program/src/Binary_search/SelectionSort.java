package Binary_search;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {5,4,1,3,2};
		System.out.println("Unsorted Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println();
		
		int[] array = selectionsort(arr);
		System.out.println("Sorted Array");
		for(int i = 0;i<array.length;i++)
		{
			System.out.println(array[i]+"");
			System.out.println();
		} 
public static int[] selectionsort(int[] arr) {
	for(int i = 0;i<arr.length-1;i++)
	{
		int minPos = i;
		for(int j = i+1;j<arr.length;j++)
		{
			if(arr[minPos]>arr[j])
			{
				minPos = j;
			}
			int temp = arr[minPos];
			arr[minPos]=arr[i];
			arr[i] = temp;
		}
	}
	return arr;
}
}
