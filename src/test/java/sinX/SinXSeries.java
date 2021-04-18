package sinX;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class SinXSeries {


	public static void main(String args[])
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n,m=-1,fact=1,i;
		double p,s=0,x,r=0;
		try
		{
			
			System.out.println("Enter the values of x:");
			x=Integer.parseInt(br.readLine());
			System.out.println("Enter the values of n:");
			n=Integer.parseInt(br.readLine());
			
			
			double rad = Math.toRadians(x);
			s=rad;
			
			for(i=3;i<n;i+=2)
			{
				p=Math.pow(rad,i);
				fact=fact*(i-1)*i;
				r=p/fact;
				s=s+m*r;
				m=m*(-1);
			}
			System.out.println("Sin("+x+")="+s);

		}
		catch(Exception e)
		{ 
			System.out.println("Enter numeric value only");
			System.out.println("Error : "+e);
		}
	}
}



/*Enter the values of x:
60
Enter the values of n:
10
Sin(60.0)=0.8660254450997811*/

