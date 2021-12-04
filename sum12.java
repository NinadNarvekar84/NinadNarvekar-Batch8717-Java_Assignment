class sum12{ 
    sum12(){
    int sum =0,digit,number = 7456;
       while(number > 0) 
       {
       digit = number % 10;
       sum = sum + digit; 
       number = number / 10; 
} 
System.out.println("Sum of digits  : "+sum);
} 
public static void main(String args[]){ 
   sum12 b=new sum12(); 
   } 
   } 