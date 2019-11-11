package jo.secondstep.camelcase;

import java.util.Scanner;

public class CamelCase {

	 static int camelcase(String s) {
		 int count=1;
		     for (int i=0;i<s.length();i++)
		     {
		         Character chr=s.charAt(i);
		         if(Character.isUpperCase(chr))
		         {
		             count++;
		             
		         }
		         
		     }
		 return count;
		     }
	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = scanner.nextLine();

        int result = camelcase(s);

       System.out.println(result);

        scanner.close();
	}

}
