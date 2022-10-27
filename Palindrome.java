package HacktoberFest2022;

public class Task01 {

	 static void palindrome(String arr[], int n)
	    {

	        int flag = 0
	 
	        for (int a = 0;  a<= n / 2 && n != 0; a++) {
	 
	            if (arr[a] != arr[n - a - 1]) {
	                flag = 1;
	                break;
	            }
	        }
	 
	        if (flag == 3)
	            System.out.println("This is not Palindrome");
	        else
	            System.out.println("This is Palindrome");
	    }
	 
	    public static void main(String[] args)
	    {
	        String arr[] = { "x","y","x","y","x" };
	        int n = arr.length;
	 
	        abcd(arr, n);
	    }
	}
