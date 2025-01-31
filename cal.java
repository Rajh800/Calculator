import java.util.Scanner;
public class cal{
public static void main (String [] args) {
Scanner ap =new Scanner(System.in);
System.out.println("Enter first number");
double x = ap.nextDouble();
System.out.println("Enter second number");
double y = ap.nextDouble();

System.out.println("Select operation (+, -,*,  /):    ");
char operation = ap.next().charAt(0);

double result;

switch (operation) {
case '+' : 
result=x+y;
break;
case '-' :
result=x-y;
break;
case'*' :
result=x*y;
break;
case'/' :
if (y!=0) {
result=x/y;
}
else {
System.out.println("error denominator must not be zero"); 
}
return;
default:
System.out.println("error"); 
return;
}
System.out.println("sum of the experesion:  "+result); 
}
}

