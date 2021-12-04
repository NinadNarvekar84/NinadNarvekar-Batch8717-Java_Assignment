class SortArray
{
public static void main(String args[])
{
int []arr={8,46,5,6,4,1};

for(int i=0;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
  {
   int temp=arr[i];
   arr[i]=arr[j];
   arr[j]=temp;
  }
}
}
System.out.println("Sorted Array:");
for(int n:arr)
{
System.out.print(n+",");
}
}
}

 