import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class readfilerk
{
	public final static int d = 256;
	
	public static void main(String[] args)
	{
		 
		try
		{
			File obj = new File("pi.txt");
			Scanner read = new Scanner(obj);
			// String pattern = "415926535";
			System.out.print("Enter your birthday string : ");
			Scanner scan = new Scanner(System.in);
			String pattern = scan.nextLine();
			
			
			String t = ":";
			char w = t.charAt(0);

			int count=0;
			
			
			
			

			while(read.hasNextLine())
			{
				count++;
				
				if(count>20)
				{

					String text = read.nextLine();
					int t_length = text.length();
					char[] t_array = text.toCharArray();

					char[] p_array = pattern.toCharArray();
					int p_length = pattern.length();

					int p_hash = 0;
			    	int t_hash = 0;
					int i,j,k,q=101;
			    	
			    	int h = 1;
			    	
			    	for(i=0;i<p_length-1;i++)
			    	{
			    		h=(h*d)%q;
			    	}

					if(p_length>t_length)
					{
						continue;
					}
					//////////////////////////////////////
					for(j=0;j<p_length;j++)
			    	{
			    		

			    		
			    		p_hash = (d*p_hash + p_array[j])%q;
			    		t_hash = (d*t_hash + t_array[j])%q;
			    	}



			    	for(i=0;i<=t_length-p_length;i++)
			    	{
			    		////////////////////////////
			    		if(t_array[i]==w)
			    			break;

			    		if(t_hash==p_hash)
			    		{
			    			for(j=0;j<p_length;j++)
			    			{
			    				if(t_array[i+j]!=p_array[j])
			    				{
			    					break;
			    				}
			    			}

			    			if(j==p_length)
			    			{
			    				System.out.printf("word occurs in line num : %d and column %d \n",count-20,i+1);
			    			}
			    		}

			    		if(i<t_length-p_length)
			    		{
			    			t_hash = (d*(t_hash-t_array[i]*h)+t_array[i+p_length])%q;

			    			if(t_hash<0)
			    			{
			    				t_hash=t_hash+q;
			    			}
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