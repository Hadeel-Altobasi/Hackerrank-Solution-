import java.util.Scanner;

public class HackerrankString {
	 static String hackerrankInString(String s) {
		 if(s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")){
		         return "YES" ;
		     } else {
		         return"NO" ;
		     }

		    }

		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args)   {
		       

		        int q = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        for (int qItr = 0; qItr < q; qItr++) {
		            String s = scanner.nextLine();

		            String result = hackerrankInString(s);

		          System.out.println(result);
		        }

		       

		        scanner.close();
		    }
}
