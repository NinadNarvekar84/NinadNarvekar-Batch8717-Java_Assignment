import java.util.*;
abstract class abs1
{
public abstract void Leap_year();
public void fibonacci_series()
{    int n1 =0, n2 =1,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int n = sc.nextInt();
System.out.print(n1+" "+n2);
for (i = 2 ; i< n; i++)
{
int n3=n1+n2;   
        System.out.print(" "+n3);   
                n1=n2;   
                        n2=n3;
                        }
}
}
class abs extends abs1
{
public void Leap_year()
{
  int year;
        System.out.println("Enter an Year :: ");
              Scanner sc = new Scanner(System.in);
                    year = sc.nextInt();
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
               System.out.println("Specified year is a leap year");
                 }
                       else{
                                System.out.println("Specified year is not a leap year");
                                   }
                                   }
                                   }
                                   class test2
                                   {
                                   public static void main (String args[])
                                   {
                                   abs obj = new abs();
                                   obj.Leap_year();
                                   obj.fibonacci_series();
}
}

 
