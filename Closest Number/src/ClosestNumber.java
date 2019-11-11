import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumber {
	 static ArrayList<Long> closestNumbers(long[] arr) {
	        Arrays.sort(arr);
	    ArrayList<Long> ans=new ArrayList<Long>();
	long min=arr[1]-arr[0];
	ans.add(arr[0]);
	ans.add(arr[1]);
	for (int i=1 ; i<arr.length-1;i++)
	{
	if(arr[i+1]-arr[i]<min)
	{
	ans.removeAll(ans);    
	ans.add(arr[i]);
	ans.add(arr[i+1]);
	min=arr[i+1]-arr[i];
	}
	else if (arr[i+1]-arr[i]==min)
	{
	    ans.add(arr[i]);
	    ans.add(arr[i+1]);
	    
	}
	    

	}
	return ans;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args)  {
	      

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        long[] arr = new long[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            long arrItem = Long.parseLong(arrItems[i]);
	            arr[i] = arrItem;
	        }

	       ArrayList<Long> result = closestNumbers(arr);

	        for (int i = 0; i < result.size(); i++) {
	        System.out.print(result.get(i));
	            if (i != result.size() - 1) {
	               System.out.print(" ");
	            }
	        }

	      
	        scanner.close();
	    }
}
