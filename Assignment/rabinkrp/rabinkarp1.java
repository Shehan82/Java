import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;

class rabinkarp1
{
	public final static int d = 256;
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

			FileWriter mywriter = new FileWriter("rabinkarpResult.txt");

			int p_hash = 0;
	    	int t_hash = 0;
			int q=101;
	    	
	    	int h = 1;

    		for(i=0;i<p_length-1;i++)
	    	{
	    		h=(h*d)%q;
	    	}

			
			for(j=0;j<p_length;j++)
	    	{
	    		

	    		
	    		p_hash = (d*p_hash + p_array[j])%q;
	    		t_hash = (d*t_hash + pi_array[j])%q;
	    	}



	    	for(i=0;i<=100000000-p_length;i++)
	    	{

	    		if(t_hash==p_hash)
	    		{
	    			for(j=0;j<p_length;j++)
	    			{
	    				if(pi_array[i+j]!=p_array[j])
	    				{
	    					break;
	    				}
	    			}

	    			if(j==p_length)
	    			{
	    				int res;
						res = (i+1)%50+((i+1)%50)/10;
						if((i+1)%50==0)
							res = 50;
						mywriter.write("word occurs in line num " + ((i+1)/50+22+(i/500)) + " and column num " + res +"\n");
	    				//System.out.println("word occurs in line num " + ((i+1)/50+22+(i/500)) + " and column num " + res +" "+i+"\n");
	    			}
	    		}

	    		if(i<100000000-p_length)
	    		{
	    			t_hash = (d*(t_hash-pi_array[i]*h)+pi_array[i+p_length])%q;

	    			if(t_hash<0)
	    			{
	    				t_hash=t_hash+q;
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