package Com;

public class MultipleCatch {
public static void main(String[] args) {
	
	try {
		 int arr[] = new int[3];
		 arr[5] = 1; // ArrayIndexOutOfBoundsException
		 } catch (ArithmeticException e) {
		 System.out.println("Arithmetic Error!");
		 } catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("Array index out of bounds!");
		 } catch (Exception e) {
		 System.out.println("General Exception occurred!");
		 }}
}
