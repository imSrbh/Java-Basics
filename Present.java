import java.util.Scanner;
 
class Present{
  public static void main(String args[]){
    int i, n, k, a[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    a = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (i = 0; i < n; i++)
      a[i] = in.nextInt();
 
    System.out.println("Enter value to find");
    k = in.nextInt();
 
    for (i = 0; i < n; i++)
    {
      if (a[i] == k)     /* Searching element is present */
      {
         System.out.println(k + " is present at location " + (i + 1) + ".");
          break;
      }
   }
   if (i == n)  /* Element to search is not present */
      System.out.println(k + " is not present in array.");
  }
}