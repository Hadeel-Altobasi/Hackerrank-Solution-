import java.util.Scanner;

public class FunnyString {
	static String funnyString(String s) {

		 StringBuilder str=new StringBuilder(s);
		       str.reverse();
		       
		       for (int i=0 ; i<s.length()-1;i++)
		       {
		            if (!((Math.abs(s.charAt(i)-s.charAt(i+1)))==Math.abs((str.charAt(i)-str.charAt(i+1)))))
		               return "Not Funny";
		           
		       }
		        return "Funny";
		    }

		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args)  {
		       

		        int q = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        for (int qItr = 0; qItr < q; qItr++) {
		            String s = scanner.nextLine();

		            String result = funnyString(s);

		           System.out.println(result);
		        }

		      
		        scanner.close();
		    }
}
