import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class readfilebm
{
	static int chars = 256;

	static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	static void bad(char []str, int size, int badc[])
	{
		int i;
		for (i=0;i< chars ;i++ )
		{
			badc[i]= -1;
		}

		for (i=0;i<size;i++ )
		{
			badc[(int)str[i]]= i;
		}
	}
	
	public static void main(String[] args)
	{
		 
		try
		{
			File obj = new File("pi.txt");
			Scanner read = new Scanner(obj);
			System.out.print("Enter your birthday string : ");
			Scanner scan = new Scanner(System.in);
			String pattern = scan.nextLine();
			
			int p_length = pattern.length();
			char[] p_array = pattern.toCharArray();

			int badchar[] = new int [chars];
			
			String t = ":";
			char w = t.charAt(0);

			int count=0;
			int count1;

			char[] t_array = new char[55];
		


			
			
			
			

			while(read.hasNextLine())
			{
				count1 = 0;
				count++;

				
				String text = read.nextLine();
				int tp_length = text.length();
				char[] tp_array = text.toCharArray();

				if(tp_length<55)
					continue;
				else
				{
					for(int k=0;k<55;k++)
					{
						
						t_array[k]=tp_array[k];
					}
				}

				int t_length = t_array.length;

				

				// if(count1 > 0)
				// {
				// 	continue;
				// }

				bad(p_array, p_length, badchar);

				int s=0;

				while(s<= (t_length- p_length))
				{
					int j=p_length-1;

					while(j>=0 && p_array[j]==t_array[s+j])
					{
						j--;
					}

					if(j<0)
					{
						System.out.println("Patterns occur at shift = " + s + " " + count);

						if(s+p_length < t_length)
							s = s + p_length - badchar[t_array[s+p_length]];
						else
							s = s + 1;
					}

					else
						s = s + max(1, j - badchar[t_array[s+j]]);
				}

				
				
			}
			
		}

		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		}
		
		
	}
}