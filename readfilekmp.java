import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class readfilekmp
{
	
	
	public static void main(String[] args)
	{
		 
		try
		{
			File obj = new File("pi.txt");
			Scanner read = new Scanner(obj);

			System.out.print("Enter your birthday string : ");
			Scanner scan = new Scanner(System.in);
			String pattern = scan.nextLine();

			char[] p_array = pattern.toCharArray();
			int p_length = p_array.length;

			String t = ":";
			char w = t.charAt(0);

			int count=0;
			int[] lps = new int[p_length];
			int t_i=1,lps_j=0;
			lps[0]=0;

			
			while(t_i<p_length)
			{
				if(p_array[t_i]==p_array[lps_j])
				{
					lps_j++;
					lps[t_i]=lps_j;
					t_i++;

				}
				else
				{
					if(lps_j!=0)
					{
						lps_j=lps[lps_j-1];
					}
					else
					{
						lps[t_i]=lps_j;
						t_i++;
					}
				}
			}
			

			while(read.hasNextLine())
			{
				count++;
				int i=0,j=0;

				String text = read.nextLine();
				int t_length = text.length();
				char[] t_array = text.toCharArray();

				while(i<t_length)
				{
					if(t_array[i]==w)
					{
						break;
					}
					if(t_array[i]==p_array[j])
					{
						j++;
						i++;
					}

					if(j==p_length)
					{
						System.out.printf("word occurs in line num : %d and column %d \n",count,i-j+1);
						j=lps[j-1];
					}
					else if(i<t_length && t_array[i]!=p_array[j])
					{
						if(j!=0)
						{
							j=lps[j-1];
						}
						else
						{
							i=i+1;
						}
					}
				}

				
				
			}
			
		}

		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		}
		
		
	}
}