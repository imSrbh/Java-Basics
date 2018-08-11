import java.util.Scanner;

interface CreditCardInterface
{
void viewCreditAmount();
void useCard();
void payCredit();
void increaseLimit();
}

class SilverCardCustomer implements CreditCardInterface
{
String name="Aru";
int cardnumber = 9234;
int creditAmount = 0;
int creditLimit=50000;

public void viewCreditAmount()
{
System.out.println("Current Credit Amount = "+creditAmount);
}

public void useCard()
{
creditAmount+=10000;
}

public void payCredit()
{
creditAmount-=10000;
}

public void increaseLimit()
{
System.out.println("Not for Silver Card Customers");
}
}

class GoldCardCustomer extends SilverCardCustomer
{
String name="Aradhya";
int cardnumber = 12348;
int creditAmount = 0;
int creditLimit=100000;

public void viewCreditAmount()
{
System.out.println("Current Credit Amount = "+creditAmount);
}

public void useCard()
{
creditAmount+=10000;
}

public void payCredit()
{
creditAmount-=10000;
}

public void increaseLimit()
{
if(creditLimit<101500)
creditLimit+=500;

else
System.out.println("Not more than 3 times");
}
}

public class Assign_11_1
{
public static void main(String args[])
{
GoldCardCustomer g=new GoldCardCustomer();
SilverCardCustomer s=new SilverCardCustomer();
s.increaseLimit();
System.out.println(" Silver Card Customer Credit Limit= "+s.creditLimit);

for(int i=0;i<3;i++)
g.increaseLimit();

System.out.println("Gold Card Customer Credit = "+g.creditLimit);
g.increaseLimit();

}
}