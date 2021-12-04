import java.util.*;
class greatest{

greatest(int num1,int num2){
if (num1 > num2) {
System.out.println("Greatest number out of 2 numbers is :"+num1);
}
      else{
      System.out.println("Greatest number out of 2 numbers is :"+num2);
      }
      }
      greatest(int num1,int num2,int num3){
      if (num1 > num2 && num1 > num3)
      {
      System.out.println("Greatest number out of 3 numbers is :"+num1);
      }
      else if(num2 > num3)
      {
      System.out.println("Greatest number out of 3 numbers is :"+num2);
      }
      else
      {
      System.out.println("Greatest number out of 3 numbers is :"+num3);
      }
}
greatest(int num1,int num2,int num3,int num4){
if (num1 > num2 && num1 > num3 && num1 > num4)
{
System.out.println("Greatest number out of 4 numbers is :"+num1);
}
else if(num2 > num3 && num2 > num4)
{
System.out.println("Greatest number out of 4 numbers is :"+num2);
}
else if (num3 > num4)
{
System.out.println("Greatest number out of 4 numbers is :"+num3);
}
else
{
System.out.println("Greatest number out of 4 numbers is :"+num4);
}
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers : ");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3= sc.nextInt();
int n4  = sc.nextInt();
greatest b1=new greatest(n1,n2);
greatest b2=new greatest(n1,n2,n3);
greatest b3=new greatest(n1,n2,n3,n4);
} 
}
