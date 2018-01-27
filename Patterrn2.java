/* Print the following pattern 
0
1 2
3 4 5
6 7 8 9
10 11 12 13 14 */



import java.io.*;
import java.util.Scanner;
public class Patterrn2{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int i,j,val=0;
		for(i=1;i<=5;i++)
		{
			System.out.println(" ");
			for(j=0;j<=i;j++)
			{
				System.out.print(val);
				val++;
			}
		}
		
	}
}