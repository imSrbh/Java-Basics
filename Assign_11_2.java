interface Printable
{
void print();
}

interface Showable extends Printable
{
void show();
}

class Assign_11_2 implements Showable
{
public void print()
{
System.out.println("Hello");
}

public void show()
{
System.out.println("Welcome");
}

public static void main(String args[])
{
Assign_11_2 a=new Assign_11_2();
a.print();
a.show();
}
}