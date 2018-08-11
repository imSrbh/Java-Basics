import java.io.*;
import java.util.Scanner;

public class Assign_8_2
{
private int password;
private String name;
private int account_no;

void access()
{
password=28;
name="Santosh";
account_no=12435;
}

public static void main(String args[])
{
Assign_8_2 a= new Assign_8_2();
a.access();
System.out.println("Name= "+a.name);
System.out.println("Account No.= "+a.account_no);
System.out.println("Password= "+a.password);
}

}