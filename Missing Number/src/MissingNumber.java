import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumber {
	static ArrayList<Integer> missingNumbers(ArrayList<Integer> num1, ArrayList<Integer> num2) {
		ArrayList<Integer> ans =  new ArrayList<Integer>();
		    java.util.Collections.sort(num1);
		  java.util.Collections.sort(num2);
		    int j =0,i=0 ;
		    while (i<num1.size() && j<num2.size())
		    {
		        if (num1.get(i)>num2.get(j))
		            {
		            ans.add(num2.get(j));
		            j++;
		            continue;
		            }
		        else if (num1.get(i)<num2.get(j))
		        {
		            ans.add(num1.get(i));
		            i++;
		            continue;    
		            
		        }
		        
		            i++; j++;
		        
		    }
		    return ans;

		    }

		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args)  {
		       

		        long n = scanner.nextLong();;
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		         ArrayList<Integer> arr =  new ArrayList<Integer>();

		        String[] arrItems = scanner.nextLine().split(" ");
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        for (int i = 0; i < n; i++) {
		            int arrItem = Integer.parseInt(arrItems[i]);
		            arr.add(arrItem);
		        }

		        long m = scanner.nextLong();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		       ArrayList<Integer> brr =  new ArrayList<Integer>();

		        String[] brrItems = scanner.nextLine().split(" ");
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        for (int i = 0; i < m; i++) {
		            int brrItem = Integer.parseInt(brrItems[i]);
		            brr.add(brrItem);
		        }

		        ArrayList<Integer> result = missingNumbers(arr, brr);

		        for (int i = 0; i < result.size(); i++) {
		           System.out.print(result.get(i));

		            if (i != result.size() - 1) {
		                System.out.print(" ");
		            }
		        }

		  
		        scanner.close();
		    }
}
