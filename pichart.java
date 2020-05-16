class pichart
{
	public static void main(String[] args)
	{
		String pattern = "aabcabcaaab";
		int m = pattern.length();
		int q;
		int[] pi=new int[m];
		pi[0]=0;
		
		int k=0;

		char[] p = pattern.toCharArray();

		for(q=1;q<m;q++)
		{
			while(k>0 && p[k]!=p[q])
			{
				k=pi[0];
			}

			if(p[k]==p[q])
			{
				k=k+1;
			}

			pi[q]=k;
		}

		for(int i=0;i<m;i++)
		{
			System.out.printf(pi[i] + " ");
		}
	}
}