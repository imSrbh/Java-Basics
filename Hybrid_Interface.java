interface A
{
void a();
}

interface B extends A
{
void b();
}

interface C extends A
{
void c();
}

class Hybrid_Interface implements B,C
{
public void a()
{
System.out.println("a");
}

public void b()
{
System.out.println("b");
}

public void c()
{
System.out.println("c");
}

public static void main(String args[])
{
Hybrid_Interface h= new Hybrid_Interface();
h.a();
h.b();
h.c();
}
}