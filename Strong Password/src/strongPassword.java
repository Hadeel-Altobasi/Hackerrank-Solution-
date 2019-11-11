import java.util.Scanner;

public class strongPassword {
	 static int minimumNumber(int n, String s) {
	        // Return the minimum number of characters to make the password strong
	String spcialChr="!@#$%^&*()-+";
	        int ans=0;
	        int flagL=0, flagD=0, flagLow=0, flagUP=0, flagSp=0;
	        if (n<6)
	            flagL=6-n;
	        for (int i =0 ; i<n;i++)
	        {
	        if (Character.isDigit(s.charAt(i)))
	            flagD++;
	        if (Character.isUpperCase(s.charAt(i)))
	            flagUP++;
	        if (Character.isLowerCase(s.charAt(i)))
	            flagLow++;
	        if(spcialChr.contains(Character.toString(s.charAt(i))))
	            flagSp++;
	            
	            
	        }
	        
	if (flagD==0)
	    ans++;
	if (flagUP==0)
	    ans++;
	if (flagLow==0)
	    ans++;
	if (flagSp==0)
	    ans++;
	 return Math.max(ans, flagL);
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String password = scanner.nextLine();

	        int answer = minimumNumber(n, password);

	      System.out.println(answer);

	        scanner.close();
	    }
}
