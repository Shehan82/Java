class lps
{
    public static void main(String[] args)
    {
        String pattern = "aabcabcaaab";
        char[] p_array = pattern.toCharArray();
        int p_length = p_array.length;
       
  
       
        
            int i=0,j=0,count=0;

            int[] lps = new int[p_length];
            int lps_len=0;

            
            int t_i=1;
            lps[0]=0;

            
            while(t_i<p_length)
            {
                if(p_array[t_i]==p_array[lps_len])
                {
                    lps_len++;
                    lps[t_i]=lps_len;
                    t_i++;

                }

                
                else
                {
                    if(lps_len!=0)
                    {
                        lps_len=lps[lps_len-1];
                    }
                    else
                    {
                        lps[t_i]=lps_len;
                        t_i++;
                    }
                }
            }


        for(int k=0;k<p_length;k++)
        {
            System.out.printf(lps[k] + " ");
        }
    }
}