/*Print the following pattern
1
22
333
4444
55555 */

import java.io.*;
import java.util.Scanner;
public class Pattern1{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int i,j;
		for(i=0;i<=5;i++)
		{
			System.out.println("");
			for(j=i;j>0;j--)
			{
				System.out.print(i);

			}
		}
		//return 0;
	}
}