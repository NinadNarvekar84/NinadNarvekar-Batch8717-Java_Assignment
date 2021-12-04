class SortStringArray
{
public static void main(String []args)
{
String []str={"Ahmednagar","Pune","Mumbai","Delhi","Alephata"};

for(int i=0;i<str.length-1;i++)
{
for(int j=i;j<str.length;j++)
{
if(str[i].compareTo(str[j])>0)
  {
  String temp=str[i];
  str[i]=str[j];
  str[j]=temp;
  }
}
}
System.out.println("Sorted String Array:");
for(String s:str)
{
System.out.print(s+" ");
}
}

}
