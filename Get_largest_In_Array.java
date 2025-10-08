package Com;

public class Get_largest_In_Array {
	public static int getlargest(int arr[]) {
		int Largest  = Integer.MIN_VALUE;
		int Smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(Largest < arr[i])
			{
				Largest = arr[i];
			}
			if(Smallest > arr[i])
			{
				Smallest = arr[i];
			}
		}
		System.out.println("The Smallest element is:" + Smallest);
		return Largest;
}
	public static void main(String[] args) {
		int[] arr= {1,4,7,9,3,8};
		int Largest = getlargest(arr);
		System.out.println("The largest element is:" + Largest);
	}}
