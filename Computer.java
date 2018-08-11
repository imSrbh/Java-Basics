import java.util.Scanner;

interface Software
{
abstract void type();
}

interface Hardware
{
abstract void component();
}

public class Computer implements Software,Hardware
{
public void type()
{
System.out.println("Web Page");
}

public void component()
{
System.out.println("Monitor");
}

public static void main(String args[])
{
Computer c=new Computer();
c.type();
c.component();
}
}