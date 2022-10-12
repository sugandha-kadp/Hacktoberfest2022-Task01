package HacktoberFest2022;

public class TEST1 {
	 static void palindrome(String arr[], int n)
	    {

	        int flag = 0;
	 
	        for (int i = 0; i <= n / 2 && n != 0; i++) {
	 
	            if (arr[i] != arr[n - i - 1]) {
	                flag = 1;
	                break;
	            }
	        }
	 
	        if (flag == 1)
	            System.out.println("This is not Palindrome");
	        else
	            System.out.println("This is Palindrome");
	    }
	 
	    public static void main(String[] args)
	    {
	        String arr[] = { "a","b","a","b","a" };
	        int n = arr.length;
	 
	        palindrome(arr, n);
	    }
	}
