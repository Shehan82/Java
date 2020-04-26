import java.util.*;

class naive
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// int i = Integer.parseInt(myString);
		String t = scan.nextLine();
		String p = scan.nextLine();

		int n = t.length();
		int m = p.length();

		char[] tarray = t.toCharArray();
		char[] parray = p.toCharArray();

		for (int i=0;i<n-m+1 ;i++ )
		{
			int j=0;

			while(j<m && tarray[i+j]==parray[j])
			{
				j++;
			}

			if(j==m)
			{
				System.out.println(i);
			}
			// else
			// {
			// 	System.out.println("there is no substring");
			// }
		}
	}
}