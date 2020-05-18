import java.lang.Math;

class rabinkarp
{
	public final static int d = 256; 
    public static void main(String[] args)
    {
    	String text = "abaabdccbaaabcdhfj";
    	String pattern = "abcd";

    	char[] t_array = text.toCharArray();
    	char[] p_array = pattern.toCharArray();

    	int t_length = text.length();
    	int p_length = pattern.length();

    	int i,j,k,q=101;
    	int p_hash = 0;
    	int t_hash = 0;
    	int h = 1;
    	

    	for(i=0;i<p_length-1;i++)
    	{
    		h=(h*d)%q;
    	}

    	

    	for(i=0;i<p_length;i++)
    	{
    		// t_hash = t_hash + (int)(t_array[i]*Math.pow(d,p_length-1-i));
    		// p_hash = p_hash + (int)(t_array[i]*Math.pow(d,p_length-1-i));

    		t_hash = (d*t_hash + t_array[i])%q;
    		p_hash = (d*p_hash + p_array[i])%q;
    	}

    	// t_hash=t_hash%q;
    	// p_hash=p_hash%q;


    	
    	

    	for(i=0;i<=t_length-p_length;i++)
    	{
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
    				System.out.println("found in " + i);
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