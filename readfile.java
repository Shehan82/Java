import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class readfile
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

			int i,count=0;

			

			while(read.hasNextLine())
			{
				count++;

				String text = read.nextLine();
				int t_length = text.length();
				char[] t_array = text.toCharArray();

				for(i=0;i<t_length-p_length+1;i++)
				{
					if(t_array[i]==w)
					{
						break;
					}
					//System.out.print(t_array[i]);

					int j = 0;
					while(j<p_length && t_array[i+j]==p_array[j])
					{
						j++;
					}

					if(j==p_length)
					{
						System.out.printf("word occurs in line num : %d and column %d \n",count,i+1);
					}
				}
				
				//System.out.print("\n");

				//read.close();
			}
			
		}

		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		}
		
		
	}
}