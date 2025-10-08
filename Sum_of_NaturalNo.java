package Com;

public class Sum_of_NaturalNo {
	    public static void main(String[] args) {
	        int number = 10;
	        int sum =naturalno(number);
	        System.out.println("Sum = " + sum);}

	    public static int naturalno(int n) {
	        if(n>=1)
	        	return n+ naturalno(n - 1);
	        else
	            return n;
	    }
}
	            
