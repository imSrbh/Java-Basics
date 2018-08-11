public class PeriArea
{
public static void main(String args[])
{
float p_c,p_rec,p_sq,a_c,a_rec,a_sq;
int l=4,x=2,y=3,r=5;

p_c=(float) (2*3.14*r);
p_rec=2*(x+y);
p_sq=4*l;

a_c=(float) (3.14*r*r);
a_rec=x*y;
a_sq=l*l;

System.out.println("The perimeters of circle, rectangle and square are"+" "+p_c+" "+p_rec+" "+p_sq);
System.out.println("The areas of circle, rectangle and square are"+" "+a_c+" "+a_rec+" "+a_sq);
}
}