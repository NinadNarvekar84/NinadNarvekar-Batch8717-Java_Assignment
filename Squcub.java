import java.util.* ;

class Squcub

{

  public static void main(String args[])

   {

      int n;

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter a number");

     n = sc.nextInt();

     if (n%2 ==0)

     System.out.println("The number is even. Its square is " + (n*n));

     else

     System.out.println("The number is odd. Its cube is " + (n*n*n));

  }

}

