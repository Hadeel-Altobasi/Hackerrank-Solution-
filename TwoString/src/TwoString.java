import java.util.Arrays;
import java.util.Scanner;

public class TwoString {
	static String twoStrings(String s1, String s2) {
		int [] freq = new int[26];
		        Arrays.fill(freq,0); 
		    
		    for (int i=0 ; i<s1.length() ;i++)
		    {
		        freq[s1.charAt(i)-'a']=1;
		        
		    }
		     for (int i=0 ; i<s2.length();i++)
		     {
		         if(freq[s2.charAt(i)-'a']==1)
		             return "YES";
		         
		     }
		     return "NO";

		    }
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

          System.out.println(result);
	}

}
}
