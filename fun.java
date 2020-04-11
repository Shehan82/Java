import java.util.*;
import java.io.*;
import java.lang.Math;

class fun{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int queries=in.nextInt();
        for(int i=0;i<queries;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                int sum = a;
                for(int k=0;k<j+1;k++)
                {
                    double x = Math.pow(2, k);
                     sum = sum + (int)x*b;

                }
                System.out.printf(sum+" ");
            }
            
        }
        in.close();
    }
}