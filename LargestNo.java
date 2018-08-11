public class LargestNo
{
public static void main(String args[])
{
int a,b,c;
a=10;
b=20;
c=5;

int d=(a>b?(a>c?a:c):(b>c?b:c));

System.out.println("The largest value is"+" "+d);
}
}