import java.io.*;
class Printstr
{
public static void main(String []args)throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter A String:");
String str="";
str=br.readLine();
int no=Integer.parseInt(br.readLine());
System.out.println("String:"+str+"\nNumber:"+no);
}
}