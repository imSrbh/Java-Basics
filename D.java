import java.io.*;
import java.util.Scanner;


class Person
{
int height,weight;
Person update_fields(Person p)
{
p.height=p.height*2;
p.weight=p.weight*2;
return p;
} 
}


class D
{

public static void main(String Args[])
{
Person a[]=new Person[10];int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=0;i<n;i++)
{

System.out.println("Enter height & weight of person "+i);
a[i]=new Person();
a[i].height=scanner.nextInt();
a[i].weight=scanner.nextInt();
a[i]=a[i].update_fields(a[i]);
System.out.println("Height of Person i: "+a[i].height);
System.out.println("Height of Person i: "+a[i].weight);
}

}
}
