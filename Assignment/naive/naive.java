import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;

class array
{
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
			FileWriter mywriter = new FileWriter("naiveResult.txt");

			for(i=0;i<100000000-p_length+1;i++)
					{
						int m = 0;
						while(m<p_length && pi_array[i+m]==p_array[m])
						{
							m++;
						}

						if(m==p_length)
						{
							int res;
							res = (i+1)%50+((i+1)%50)/10;
							if((i+1)%50==0)
								res = 50;
							

							mywriter.write("word occurs in line num " + ((i+1)/50+22+(i/500)) + " and column num " + res +"\n");
							//mywriter.write("hellooo " + i);
							//System.out.println("word occurs in line num " + ((i+1)/50+22+(i/500)) + " and column num " + res +" "+i+"\n");

						}
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