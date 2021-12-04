import java.util.*;
class profit_loss{

profit_loss(int c_price,int s_price){
if (s_price == c_price){
System.out.println("No profit nor Loss");
}

    else if (s_price > c_price){
        System.out.println("You have earn profit ");
}

    else{
        System.out.println("Loss");
}
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter cost price : ");
int c = sc.nextInt();
System.out.println("Enter selling price : ");
int p = sc.nextInt();
   profit_loss b=new profit_loss(c,p); 
} 
}
