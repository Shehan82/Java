import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;

class boyermoore
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
			Scanner scan = new Scanner(System.in);
			String pattern = scan.nextLine();

			char[] p_array = pattern.toCharArray();
			int p_length = p_array.length;


			String t = " ";
			char w = t.charAt(0);

			int i,count=0,j=0,k;

			char[] pi_array = new char[100000000];

			

			while(read.hasNextLine())
			{
				count++;
				
				String text = read.nextLine();
				
				if(count>21)
				{
					char[] t_array = text.toCharArray();
					int t_length = text.length();
					if(t_length>20)
					{
						for(k=0;k<t_length;k++)
						{
							if(t_array[k]==w)
							{
								for(i=k;i<t_length-1;i++)
								{
									t_array[i]=t_array[i+1];
								}
							}
						}

						for(i=0;i<50;i++)
						{
							pi_array[i+j]=t_array[i];
						}

						j=j+50;
					}



				}
	

			}

			// File myobj = new File("naiveResult.txt");
			// myobj.createNewFile();
			FileWriter mywriter = new FileWriter("boyerResult.txt");

			int badchar[] = new int [chars];

			bad(p_array, p_length, badchar);

					int s=0;

					while(s<= (100000000- p_length))
					{
						j=p_length-1;

						while(j>=0 && p_array[j]==pi_array[s+j])
						{
							j--;
						}

						if(j<0)
						{
							int res;
							res = (s+1)%50+((s+1)%50)/10;
							if((s+1)%50==0)
								res = 50;
							//System.out.println("Patterns occur at shift = " + ((s+1)/50+22+(s/500)) + " " + count);
							//mywriter.write("word occurs in line num " + ((i+1)/50+22+(i/500)) + " and column num " + res +"\n");
							System.out.println("word occurs in line num " + ((s+1)/50+22+(s/500)) + " and column num " + res +" "+s+"\n");

							if(s+p_length < 100000000)
								s = s + p_length - badchar[pi_array[s+p_length]];
							else
								s = s + 1;
						}

						else
							s = s + max(1, j - badchar[pi_array[s+j]]);
					}
					mywriter.close();

			
		}

		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		}

		catch(IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
	}
}