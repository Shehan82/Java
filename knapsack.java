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


		float [] x = new float[n];
		for(i=0; i<n; i++)
		{
			x[i]=0;
		}

		int wt=0;
		int p=0;

		while(wt<w)
		{
			
			if(wt+weightnew[p]<=w)
			{
				x[p]=1*value[p];
				wt = wt + weightnew[p];
			}
			else
			{
				x[p]=((w-wt)*value[p]/weightnew[p]);
				wt = w;
			}
			p++;
		}

		System.out.print(Arrays.toString(x));

	}

	public static void main(String[] args)
	{
		int[] w = {1,2,3};
		int[] v = {6,10,12};
		int num = 5;

		knap(w,v,num);

















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