import java.io.*;
class ReverseNo
{
public static void main(String []args)
{
int no=12345,rno=0;
for(;no>0;no/=10)
{
int mod=no%10;
rno=rno*10+mod;
}
System.out.print("Reverse No:"+rno);
}
}