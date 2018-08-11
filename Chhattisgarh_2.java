import java.io.*;
import java.util.Scanner;

 class India
{
String capital="New Delhi";
}

class Central_India extends India
{
String capital="Nagpur";
void Capital()
{
System.out.println(this.capital);
System.out.println(super.capital);
}

}

public class Chhattisgarh_2 extends India
{
String capital="Raipur";
void Capital()
{
System.out.println(this.capital);
System.out.println(super.capital);
}

public static void main(String args[])
{
Chhattisgarh_2 c=new Chhattisgarh_2();
c.Capital();

Central_India i=new Central_India();
i.Capital();
}
}



