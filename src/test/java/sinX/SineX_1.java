package sinX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SineX_1 {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values of x:");
	     double	x=Integer.parseInt(br.readLine());
		System.out.println(Math.sin(Math.toRadians(x)));
	}
}
