import java.io.*;
import java.util.Scanner;

class India
{
void capital()
{
final String country_name="India";
System.out.println(country_name);
System.out.println("New Delhi");
}
}

class Central_India extends India
{
void capital()
{
System.out.println("Nagpur");
super.capital();
}

}

class Chhattisgarh extends Central_India
{
void capital()
{
System.out.println("Raipur");
super.capital();
}


public static void main(String args[])
{
Chhattisgarh c=new Chhattisgarh();
c.capital();
}
}



