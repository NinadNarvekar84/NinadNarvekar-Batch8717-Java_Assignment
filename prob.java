package calcy;
import java.util.*;
public class fibonacci extends ascending {
public void fibon(){
int a, b, c, n;
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number");
n= sc.nextInt();
a = 0;
b = 1;
c = b;
while (c <=n){
System.out.println(c);
c = a + b;
a = b;
b = c;
}
}
}
class ascending  extends desending{
public void asc (){
Scanner sc = new Scanner (System.in);
int num = 0;
int total = 0;
System.out.println("Enter Size of array");
num = sc.nextInt();
int [] arr = new int [num];
System.out.println("Enter Value");
for (int i = 0; i< num; i++){
arr[i] = sc.nextInt();
}
int temp = 0;
for (int i =0; i<arr.length;i++){
for(int j = i+1; j<arr.length; j++){
if(arr[i]>arr[j]){
temp = arr[i];
arr[i] =arr[j];
arr[j] = temp;
}
}
}
System.out.println("Element of array");
for (int i = 1; i< arr.length; i++){
System.out.println(arr[i] + "");
}
}
}
class desending {
public void des(){
Scanner sc = new Scanner (System.in);
int num = 0;
int total=0;
System.out.println("Enter size of array");
num = sc.nextInt();
int[]arr = new int[num];
System.out.println("Enter value");
for(int i = 0; i <num; i++){
arr[i] = sc.nextInt();
}
int temp = 0;
for (int i =0; i<arr.length;i++){
for(int j = i+1; j<arr.length; j++){
if(arr[i]<arr[j]){
temp = arr[i];
arr[i] =arr[j];
arr[j] = temp;
}
}
}
System.out.println("Element of array");
for (int i = 0; i< arr.length; i++){
System.out.println(arr[i] + "");
}
}
}

------------------------------------------
package demo;
import java.util.*;
public class factorial extends vowel{
public void fact(){
int i, n, fac = 1;
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number");
n = sc.nextInt();
for(i =1; i <= n; i++){
fac = fac * i;
}
System.out.println(fac);
}
}
class vowel{
public void vow(){

char letter;
Scanner sc = new Scanner (System.in);
System.out.println("enter letter");

letter = sc.next().charAt(0);

switch (letter){
case 'A' :
case 'a' :
case 'E' :
case 'e' :
case 'I' :
case 'i' :
case 'O' :
case 'o' :
case 'U' :
case 'u' :
System.out.println("it is vowel");
break;
default :
System.out.println("it is not vowel");
break;
}
}
}
------------------------------

import calcy.*;
import demo.*;
import java.util.*;


public class prob{
public static void main (String args[]){
fibonacci obj = new fibonacci();
obj.fibon();
obj.asc();
obj.des();
factorial obj1 = new factorial();
obj1.fact();
obj1.vow();
}
}



 
