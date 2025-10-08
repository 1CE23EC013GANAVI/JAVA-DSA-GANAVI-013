package Com;

public class Bubble_sort {
void bubblesort(int arr[]) {
	
	for(int i =0; i<arr.length; i++)
	{
		for(int j=0; j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
 }
 public static void main(String args[])
 {
     Bubble_sort ob = new Bubble_sort();
     int array[] = { 4,5,1,3,2};
   
     ob.bubblesort(array);
   
     for (int i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
         System.out.println();
 
 }

	
}




