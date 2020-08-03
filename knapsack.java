import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 
class knapsack
{
	static void knap(int[] weight,int[] value,int w)
	{
		int i,j;
		int n = value.length;
		int[] weightnew = new int[n];
		int[] k = new int[n];
		Integer[] divide = new Integer[n];

		for(i=0; i<n; i++)
		{
			divide[i]=(value[i]/weight[i]);
		}

		Arrays.sort(divide, Collections.reverseOrder());


		System.out.print(Arrays.toString(divide));

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(k[j]==0)
				{
					if(divide[i]*weight[j]==value[j])
					{
						k[j]=1;
						weightnew[i]=weight[j];
						break;
						
					}
				}
				
			}
		}

		System.out.print(Arrays.toString(weightnew));


		int [] x = new double[n];
		for(i=0; i<n; i++)
		{
			x[i]=0.0;
		}

		int wt=0;

		while(wt<w)
		{
			int i=0;
			if(wt+weight[i]<=w)
			{
				x[i]=1;
			}
		}

	}

	public static void main(String[] args)
	{
		int[] w = {1,2,3};
		int[] v = {6,10,24};

		knap(w,v);

















		// int i,j,n=3;
		// int[] weight = {1,2,3};
		// int[] value = {6,10,24};
		// int[] weightnew = new int[n];
		// int[] k = new int[n];
		// Integer[] divide = new Integer[n];
		
		
		// for(i=0; i<n; i++)
		// {
		// 	divide[i]=(value[i]/weight[i]);
		// }

		// Arrays.sort(divide, Collections.reverseOrder());


		// System.out.print(Arrays.toString(divide));

		// for(i=0;i<n;i++)
		// {
		// 	for(j=0;j<n;j++)
		// 	{
		// 		if(k[j]==0)
		// 		{
		// 			if(divide[i]*weight[j]==value[j])
		// 			{
		// 				k[j]=1;
		// 				weightnew[i]=weight[j];
		// 				break;
						
		// 			}
		// 		}
				
		// 	}
		// }

		// System.out.print(Arrays.toString(weightnew));
	}

	
}