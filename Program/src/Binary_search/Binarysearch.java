package Binary_search;

public class Binarysearch {
public static void main(String[] args) {
	int arr[] = { 1,3,5,7,9,15,31};
	int key = 15;
	int index = Binarysearch(arr,key);
	if(index == 1)
		System.out.println("Element noy found");
	else
		System.out.println("Element found at:" + index);
}
public static int Binarysearch(int arr[], int key) {
	int start = 0, end = arr.length;
	while(start<end)
	{
		int mid = (start+end)/2;
		if(arr[mid] == key)
		{
			return mid;
		}
		else if(key>arr[mid])
		{
			start = mid+1;
		}
		else
		{
			end = mid - 1;
		}
	}
	return end;

}}
