import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 
class knapsack
{
	public static void main(String[] args)
	{
		int i,j,n=3;
		int[] weight = {1,2,3};
		int[] value = {6,10,24};
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
	}

	
}