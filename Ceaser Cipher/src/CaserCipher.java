import java.util.Scanner;

public class CaserCipher {
	 static String caesarCipher(String s, int k) {
		    
		 char[] newStr=new char[s.length()];
		        char chr = 'a';
		        String symbol=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
		        char[] alphapet = new char[26];
		        for (int i = 0; i < 26; i++) {
		            alphapet[i] = chr;
		            chr++;

		        }

		        for (int i = 0; i < s.length(); i++) {
		            int index;
		            if (symbol.contains(Character.toString(s.charAt(i))))
		            {
		                newStr[i]=s.charAt(i);
		                continue;
		            }
		            if (Character.isDigit(s.charAt(i)))
		            {
		                newStr[i]=s.charAt(i);
		                continue;
		            }
		            if (Character.isUpperCase(s.charAt(i)))
		                index = Math.abs((s.charAt(i) - 'A') + k);
		            else
		                index = Math.abs((s.charAt(i) - 'a') + k);
		            if (index > 25)
		                index = index % 26;
		            if (Character.isUpperCase(s.charAt(i)))
		                //newStr = newStr.replace(s.charAt(i), Character.toUpperCase(alphapet[index]));
		                newStr[i]=Character.toUpperCase(alphapet[index]);

		            else
		                newStr[i] = alphapet[index];

		           // System.out.print(newStr[i]+" ");
		        }
		       // System.out.println(newStr);
		return String.valueOf(newStr);
		    }
	 
	 
	 private static final Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int k = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String result = caesarCipher(s, k);

	      System.out.println(result);

	        scanner.close();
	}

}
