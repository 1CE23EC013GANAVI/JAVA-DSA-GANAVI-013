package Com;

public class Factorial {
	public static void main(String[] args) {
        int n = 6;
        long factorial = factorial(n);
        System.out.println("Factorial of " + n + " = " + factorial);
    }
    public static long factorial(int n)
    {
        if (n >= 1)// or if(n==0 || n==1)
            return n * factorial(n - 1);
        else
            return 1;
    }
}







