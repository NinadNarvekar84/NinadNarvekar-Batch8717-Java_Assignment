import java.util.Scanner;
class CheckNo
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Number:");
int no=sc.nextInt();
if(no==0)
{
System.out.println(no+" is Zero");
}
else
      if(no>0)
      System.out.println(no+" is Positive");
            else
            System.out.println(no+" is Nigative");
            }
            }
