import java.util.Scanner;
class AddNo
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int no,sum=0;
System.out.print("Enter a Number=");
no=sc.nextInt();
for(;no!=0;no/=10)
{
sum=sum+(no%10);
}
System.out.println("Sum of this No digits:"+sum);
}
}
