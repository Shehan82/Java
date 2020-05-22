import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;

class kmp
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
			FileWriter mywriter = new FileWriter("kmpResult.txt");
			i=0;
			j=0;
			while(i<100000000)
			{
				
				if(pi_array[i]==p_array[j])
				{
					j++;
					i++;
				}

				if(j==p_length)
				{
					int res;
					res = (i-j+1)%50+((i-j+1)%50)/10;
					if((i-j+1)%50==0)
						res = 50;
					

					mywriter.write("word occurs in line num " + ((i-j+1)/50+22+((i-j)/500)) + " and column num " + res +" "+"\n");
					//System.out.println("word occurs in line num " + ((i-j+1)/50+22+((i-j)/500)) + " and column num " + res +" "+(i-j)+"\n");
					j=lps[j-1];
				}
				else if(i<100000000 && pi_array[i]!=p_array[j])
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