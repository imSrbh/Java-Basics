public class Assign_11_4
{
public static void main(String args[])
{

try
{
int n=7/0;
}
catch(ArithmeticException a)
{
System.out.println(a);
}

finally
{
System.out.print("Always Printed!");
}

}
}