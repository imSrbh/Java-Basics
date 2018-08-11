import java.io.*;
import java.util.Scanner;

int i=0;
public class Employee
{
string name;
string pos;
int salary;
Scanner scanner=new Scanner(System.in);
public static void main(String Args[])
{
input();
}
}


class Process
{
int k;
Employee e[]=new Employee[15];
input()
{
do
{
System.out.println("Enter name, position & salary");
name=scanner.next();
pos=scanner.next();
salary=scanner.nextInt();

e[i]=new Employee(name,pos,salary);
i=i+1;

System.out.print("Do you want to enter another data? yes=1 No=0");
k=scanner.nextInt();
}while(k==1);
}
}