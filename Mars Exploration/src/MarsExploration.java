import java.util.Scanner;

public class MarsExploration {
	 static int marsExploration(String s) {
		 int n=s.length()/3;
		        int j=0;
		        int flag = 0;
		        for (int i=0 ; i<n;i++)
		        {
		            String str= s.substring(j, j+3);
		            if (!(str.charAt(0)=='S'))
		                flag=flag+1;
		            if (!(str.charAt(1)=='O'))
		                flag=flag+1;
		            if (!(str.charAt(2)=='S'))
		                flag=flag+1;
		                
		                    j=j+3;
		            
		            
		        }
		        return flag;  

		    }

		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args)  {
		      

		        String s = scanner.nextLine();

		        int result = marsExploration(s);

		      System.out.println(result);
		        scanner.close();
		    }
}
