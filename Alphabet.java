import java.io.*;
import java.util.Scanner;

public class Alphabet{
public static void main(String args [])
{
Scanner scanner = new Scanner(System.in);

	int i=0;
	System.out.println("Enter a character : ");
	char ch=scanner.next( ).charAt(0);	 		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character "+ch+" is  Vowel"); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonant");
	      else
		System.out.println("Not an alphabet");		
	}
}