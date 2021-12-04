class Avg
{
public static void main(String []args)
{
int []arr={1,2,3,4,5,6,7,8,9,10};
int n=arr.length,sum=0;
for(int i=0;i<n;i++)
{
sum=sum+arr[i];
}
System.out.println("Adition of no="+sum);
System.out.println("Average of no="+(sum/n));
}
}