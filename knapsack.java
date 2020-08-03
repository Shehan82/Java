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
		int[] valuenew = new int[n];
		int[] k = new int[n];
		Integer[] divide = new Integer[n];

		for(i=0; i<n; i++)
		{
			divide[i]=(value[i]/weight[i]);
		}

		Arrays.sort(divide, Collections.reverseOrder());


		System.out.println(Arrays.toString(divide));

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
						valuenew[i]=value[j];
						break;
						
					}
				}
				
			}
		}

		System.out.println(Arrays.toString(weightnew));
		System.out.println(Arrays.toString(valuenew));
	


		double [] x = new double[n];
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
				x[p]=1*valuenew[p];
				wt = wt + weightnew[p];
			}
			else
			{
				x[p]=((w-wt)*valuenew[p]/weightnew[p]);
				wt = w;
			}
			p++;
		}

		double sum = 0;
		for(double num : x)
		{
			sum = sum + num;
		}

		int sum1 = (int) sum;

		System.out.print(Arrays.toString(x));
		System.out.print(sum1);

	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();

		int t;

		int[] numOfBottles = new int[n];
		int[] value = new int[n];

		for(t=0; t<n;t++)
		{
			int a = scan.nextInt();
			numOfBottles[t]=a;
		}

		for(t=0; t<n;t++)
		{
			int b = scan.nextInt();
			value[t]=b;
		}

		// int[] w = new int[n];
		// int[] v = new int[n];

		// int[] w = {1,2,3};
		// int[] v = {6,10,24};
		// int num = 5;

		knap(numOfBottles,value,w);


	}

	
}